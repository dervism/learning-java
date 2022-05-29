package no.dervis.learningjava.labs.parking_house;

import java.util.Random;

import static no.dervis.learningjava.labs.parking_house.LicensePlate.NORWAY;
import static no.dervis.learningjava.labs.parking_house.LicensePlate.POLAND;

public class LicensePlateBuilder {

    private final String number;

    public LicensePlateBuilder(String number) {
        this.number = number;
    }

    public static LicensePlateBuilder forCountry(final LicensePlate licensePlate) {

        return switch (licensePlate) {
            case NORWAY -> LicensePlateBuilder.pattern(NORWAY.getPattern());
            case POLAND -> LicensePlateBuilder.pattern(POLAND.getPattern());
            default -> LicensePlateBuilder.pattern("LLLLL");
        };

    }

    public static LicensePlateBuilder pattern(final String pattern) {
        Random random = new Random(System.nanoTime());
        StringBuilder buffer = new StringBuilder(pattern.length());

        char[] chars = pattern.toCharArray();
        for (char patternChar : chars) {
            switch (patternChar) {
                case 'L' -> buffer.append((char) ('A' + random.nextInt('Z' - 'A' + 1)));
                case 'D' -> buffer.append(1 + random.nextInt(9));
                default -> buffer.append(patternChar);
            }
        }

        return new LicensePlateBuilder(buffer.toString());
    }

    public static LicensePlateNumber random() {
        return forCountry(NORWAY).build();
    }

    public LicensePlateNumber build() {
        return new LicensePlateNumber(number);
    }

    @Override
    public String toString() {
        return number;
    }
}
