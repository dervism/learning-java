package no.dervis.learningjava.labs.parking_house;

public class Automobile extends Vehicle {

    public Automobile(LicensePlateNumber plateNr) {
        super(VehicleType.CAR, plateNr);
    }

    public Automobile(VehicleType vehicleType, LicensePlateNumber plateNr) {
        super(vehicleType, plateNr);
    }
}
