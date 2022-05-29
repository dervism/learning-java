package no.dervis.learningjava.labs.parking_house;

import java.util.Objects;

public record LicensePlateNumber(String plateNr) {

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

}
