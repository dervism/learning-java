package no.dervis.learningjava.labs.parking_house;

import java.util.Arrays;
import java.util.List;

public class CarParking extends AbstractParkingHouse {

    public CarParking() {
        this(300);
    }

    public CarParking(int availableSpots) {
        super(availableSpots);
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

        ParkingTicket ticket = super.registerParking(vehicle);

        System.out.println("Automobile with plate nr " + vehicle.getPlateNr() + " has been parked at slot nr " + ticket.getParkingSlotNr());

        return ticket;
    }

}
