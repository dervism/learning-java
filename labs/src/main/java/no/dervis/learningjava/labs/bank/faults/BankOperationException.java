package no.dervis.learningjava.labs.bank.faults;

public class BankOperationException extends RuntimeException {
    public BankOperationException() {
    }

    public BankOperationException(String message) {
        super(message);
    }

    public BankOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankOperationException(Throwable cause) {
        super(cause);
    }

    public BankOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
