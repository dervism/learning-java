package no.dervis.learningjava.labs.parking_house;

import java.util.Objects;

public class LicensePlateNumber {

    private String plateNr;

    public LicensePlateNumber(String plateNr) {
        this.plateNr = plateNr;
    }

    public String getPlateNr() {
        return plateNr;
    }

    @Override
    public String toString() {
        return plateNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LicensePlateNumber that = (LicensePlateNumber) o;
        return Objects.equals(plateNr, that.plateNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNr);
    }
}
