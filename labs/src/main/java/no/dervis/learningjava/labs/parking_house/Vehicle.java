package no.dervis.learningjava.labs.parking_house;

/**
 * Definition:
 * A vehicle is anything that transports a person or thing, usually a car. But a vehicle
 * can be a truck, a plane, a bus, a blimp or even a shopping cart, anything that transports
 * people or things.
 */
public abstract class Vehicle {
    private LicensePlateNumber plateNr;

    private VehicleType vehicleType;


    public Vehicle(VehicleType vehicleType, LicensePlateNumber plateNr) {
        this.plateNr = plateNr;
        this.vehicleType = vehicleType;
    }

    public LicensePlateNumber getPlateNr() {
        return plateNr;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNr=" + plateNr +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
