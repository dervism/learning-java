package no.dervis.learningjava.labs.parking_house;

import java.util.EnumSet;

import static no.dervis.learningjava.labs.parking_house.VehicleType.BIKE;
import static no.dervis.learningjava.labs.parking_house.VehicleType.BUS;
import static no.dervis.learningjava.labs.parking_house.VehicleType.CAR;
import static no.dervis.learningjava.labs.parking_house.VehicleType.TRUCK;

public class Automobile extends Vehicle {

    public Automobile(LicensePlateNumber plateNr) {
        this(CAR, plateNr);
    }

    public Automobile(VehicleType vehicleType) {
        this(vehicleType, LicensePlateBuilder.random());
    }

    public Automobile(VehicleType vehicleType, LicensePlateNumber plateNr) {
        super(vehicleType, plateNr);

        EnumSet<VehicleType> types = EnumSet.of(CAR, TRUCK, BIKE, BUS);
        if (!types.contains(vehicleType))
            throw new IllegalArgumentException("Automobile class accepts only " + types);
    }
}
