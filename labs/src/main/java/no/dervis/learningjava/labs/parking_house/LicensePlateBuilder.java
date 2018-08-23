package no.dervis.learningjava.labs.parking_house;

import java.util.Random;

import static no.dervis.learningjava.labs.parking_house.LicensePlate.*;

public class LicensePlateBuilder {

    private String number;

    public LicensePlateBuilder() { }

    public LicensePlateBuilder(String number) {
        this.number = number;
    }

    public static LicensePlateBuilder forCountry(final LicensePlate licensePlate) {

        switch (licensePlate) {
            case NORWAY:
                return LicensePlateBuilder.pattern(NORWAY.getPattern());
            case POLAND:
                return LicensePlateBuilder.pattern(POLAND.getPattern());
        }

        return LicensePlateBuilder.pattern("LLLLL");
    }

    public static LicensePlateBuilder pattern(final String pattern) {
        Random random = new Random(System.nanoTime());
        StringBuilder buffer = new StringBuilder(pattern.length());

        char[] chars = pattern.toCharArray();
        for (char patternChar : chars) {
            switch (patternChar) {
                case 'L':
                    buffer.append( (char) ('A' + random.nextInt('Z' - 'A' + 1)) );
                    break;
                case 'D':
                    buffer.append( 1 + random.nextInt(9) );
                    break;
                default:
                    buffer.append(patternChar);
                    break;
            }
        }

        return new LicensePlateBuilder(buffer.toString());
    }

    public LicensePlateNumber build() {
        return new LicensePlateNumber(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
