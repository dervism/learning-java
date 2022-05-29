package no.dervis.learningjava.labs.parking_house;

import no.dervis.learningjava.labs.parking_house.faults.ParkingException;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractParkingHouse implements ParkingHouse {
    protected final int availableSpots;
    protected int parkedCars;

    protected Map<LicensePlateNumber, ParkingTicket> map;

    public AbstractParkingHouse(int availableSpots) {
        this.availableSpots = availableSpots;
        this.map = new HashMap<>(availableSpots);
    }

    @Override
    public ParkingTicket registerParking(Vehicle vehicle) {

        if (!availableSpotLeft())
            throw new RuntimeException("There is no space left in this parking house.");

        VehicleType vehicleType = vehicle.getVehicleType();
        if (!acceptedVehicleTypes().contains(vehicleType)) {
            throw new ParkingException("This Parking House does not accept vehicles of type " + vehicleType);
        }

        ParkingTicket ticket = new ParkingTicket(vehicle.getPlateNr(), ++parkedCars);
        map.put(vehicle.getPlateNr(), ticket);

        return ticket;
    }

    @Override
    public boolean removeFromParking(Vehicle vehicle) {

        if (!map.containsKey(vehicle.getPlateNr())) return false;

        ParkingTicket parkingTicket = map.remove(vehicle.getPlateNr());
        Duration duration = parkingTicket.finish();
        double price = (duration.toHours() > 0 ? duration.toHours() : 1) * parkingCost().getCostPrHour();

        System.out.printf("%s has parked %s hours %s minutes and %s seconds. Total price: %s%n",
                vehicle, duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart(), price);

        return true;
    }

    @Override
    public boolean availableSpotLeft() {
        return availableSpots() > 0;
    }

    @Override
    public int availableSpots() {
        return availableSpots - parkedCars;
    }
}
