package no.dervis.learningjava.labs.parking_house;

import static no.dervis.learningjava.labs.parking_house.LicensePlateBuilder.forCountry;

public class Parking {
    public static void main(String[] args) {
        System.out.println("Parking House lab.");

        ParkingHouse carParking = new CarParking();

        Automobile mercedes = new Automobile(forCountry(LicensePlate.NORWAY).build());
        Automobile bmw = new Automobile(forCountry(LicensePlate.NORWAY).build());
        //Automobile truck = new Automobile(VehicleType.TRUCK, new LicensePlateNumber("AB62543"));

        carParking.registerParking(mercedes);
        carParking.registerParking(bmw);
        //carParking.registerParking(truck);
    }
}
