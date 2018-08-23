package no.dervis.learningjava.labs.parking_house;

import java.util.UUID;

public class ParkingTicket {
    private String ticketId;

    private long startTime;

    private long endTime;

    // where the vehicle is parked
    private int parkingSlotNr;

    private LicensePlateNumber licensePlateNumber;

    public ParkingTicket(LicensePlateNumber licensePlateNumber) {
        this(licensePlateNumber, System.nanoTime(), 0);
    }

    public ParkingTicket(LicensePlateNumber licensePlateNumber, int parkingSlotNr) {
        this(licensePlateNumber, System.nanoTime(), parkingSlotNr);
    }

    public ParkingTicket(LicensePlateNumber licensePlateNumber, long startTime, int parkingSlotNr) {
        this.startTime = startTime;
        this.endTime = 0;
        this.parkingSlotNr = parkingSlotNr;
        this.licensePlateNumber = licensePlateNumber;
        this.ticketId = UUID.randomUUID().toString();
    }

    public void finish() {
        if (endTime == 0) this.endTime = System.nanoTime();
    }

    public long getTotalTime() {
        if (endTime == 0) this.endTime = System.nanoTime();
        return endTime - startTime;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", ticketId=" + ticketId +
                ", parkingSlotNr=" + parkingSlotNr +
                ", licensePlateNumber=" + licensePlateNumber +
                '}';
    }
}
