package no.dervis.learningjava.labs.parking_house;

import java.util.List;

public interface ParkingHouse {
    List<VehicleType> acceptedVehicleType();

    ParkingCost parkingCost();

    ParkingTicket registerParking(Vehicle vehicle);

    Vehicle removeFromParking(ParkingTicket parkingTicket);

    int availableSpotLeft();
}
