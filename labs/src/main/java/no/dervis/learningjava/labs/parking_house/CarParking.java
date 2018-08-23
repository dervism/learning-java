package no.dervis.learningjava.labs.parking_house;

import no.dervis.learningjava.labs.parking_house.faults.ParkingException;

import java.util.Arrays;
import java.util.List;

public class CarParking implements ParkingHouse {

    private int availableSpots;

    public CarParking() {
        this(300);
    }

    public CarParking(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    @Override
    public List<VehicleType> acceptedVehicleType() {
        return Arrays.asList(VehicleType.CAR, VehicleType.BIKE);
    }

    @Override
    public ParkingCost parkingCost() {
        return new ParkingCost(10D);
    }

    @Override
    public ParkingTicket registerParking(Vehicle vehicle) {
        availableSpots--;

        VehicleType vehicleType = vehicle.getVehicleType();
        if (!acceptedVehicleType().contains(vehicleType)) {
            throw new ParkingException("This Parking House does not accept vehlicles of type " + vehicleType);
        }

        System.out.println("Automobile with plate nr " + vehicle.getPlateNr() + " has been parked.");

        return null;
    }

    @Override
    public Vehicle removeFromParking(ParkingTicket parkingTicket) {
        return null;
    }

    @Override
    public int availableSpotLeft() {
        return availableSpots;
    }
}
