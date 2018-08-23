package no.dervis.learningjava.labs.parking_house;

/**
 * Can be a list, a database, cloud source etc.
 */

public interface ParkingHouseRegistry<T extends Vehicle> {

    boolean add(T t);
    boolean remove(T t);
    T get(LicensePlateNumber licensePlateNumber);
    T get(int index);
}
