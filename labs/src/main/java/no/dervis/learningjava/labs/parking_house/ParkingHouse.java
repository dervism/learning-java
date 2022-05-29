package no.dervis.learningjava.labs.parking_house;

import java.util.List;

public interface ParkingHouse {
    List<VehicleType> acceptedVehicleTypes();

    ParkingCost parkingCost();

    ParkingTicket registerParking(Vehicle vehicle);

    boolean removeFromParking(Vehicle vehicle);

    boolean availableSpotLeft();

    int availableSpots();
}
