package no.dervis.learningjava.labs.parking_house.faults;

public class ParkingException extends RuntimeException {
    public ParkingException() {
        super();
    }

    public ParkingException(String message) {
        super(message);
    }

    public ParkingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingException(Throwable cause) {
        super(cause);
    }

    protected ParkingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
