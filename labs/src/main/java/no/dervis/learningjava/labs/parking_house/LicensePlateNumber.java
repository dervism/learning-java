package no.dervis.learningjava.labs.parking_house;

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
}
