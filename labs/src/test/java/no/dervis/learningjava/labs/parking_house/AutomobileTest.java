package no.dervis.learningjava.labs.parking_house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AutomobileTest {

    @Test
    void accept_correct_type() {
        new Automobile(VehicleType.CAR, new LicensePlateNumber("AB12345"));
    }

    @Test
    void fail_if_wrong_type() {
        assertThrows(IllegalArgumentException.class, () -> new Automobile(VehicleType.AIRPLANE));
    }
}