package no.dervis.learningjava.labs.parking_house;

import java.time.Duration;
import java.util.Objects;
import java.util.UUID;

public class ParkingTicket {

    private final String ticketId;
    private final long startTime;
    private long endTime;
    private final int parkingSlotNr;
    private final LicensePlateNumber licensePlateNumber;

    public ParkingTicket(LicensePlateNumber licensePlateNumber) {
        this(licensePlateNumber, System.nanoTime(), 0);
    }

    public ParkingTicket(LicensePlateNumber licensePlateNumber, int parkingSlotNr) {
        this(licensePlateNumber, System.nanoTime(), parkingSlotNr);
    }

    public ParkingTicket(LicensePlateNumber licensePlateNumber, long startTime, int parkingSlotNr) {
        this.licensePlateNumber = licensePlateNumber;
        this.startTime = startTime;
        this.parkingSlotNr = parkingSlotNr;
        this.endTime = 0;
        this.ticketId = UUID.randomUUID().toString();
    }

    public Duration finish() {
        if (endTime == 0) this.endTime = System.nanoTime();
        return Duration.ofNanos(getTotalTime());
    }

    public long getTotalTime() {
        if (endTime == 0) this.endTime = System.nanoTime();
        return endTime - startTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public int getParkingSlotNr() {
        return parkingSlotNr;
    }

    public LicensePlateNumber getLicensePlateNumber() {
        return licensePlateNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingTicket that = (ParkingTicket) o;
        return parkingSlotNr == that.parkingSlotNr &&
                Objects.equals(ticketId, that.ticketId) &&
                Objects.equals(licensePlateNumber, that.licensePlateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, parkingSlotNr, licensePlateNumber);
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
