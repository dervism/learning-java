package no.dervis.learningjava.labs.bank.operations.outputs;

public class BooleanOutput {

    private final boolean success;

    private Exception exception;

    public BooleanOutput(boolean success) {
        this.success = success;
    }

    public BooleanOutput(boolean success, Exception exception) {
        this.success = success;
        this.exception = exception;
    }

    public boolean isSuccess() {
        return success;
    }

    public Exception getException() {
        return exception;
    }

    @Override
    public String toString() {
        return "BooleanOutput{" +
                "success=" + success +
                '}';
    }
}
