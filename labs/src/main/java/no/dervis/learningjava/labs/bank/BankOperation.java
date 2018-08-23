package no.dervis.learningjava.labs.bank;

import no.dervis.learningjava.labs.bank.faults.BankOperationException;

import java.util.Objects;

@FunctionalInterface
public interface BankOperation<INPUT, OUTPUT> {

    OUTPUT doOperation(INPUT input) throws BankOperationException;


    /**
     * Do something with the input of this operation.
     */
    default <R> BankOperation<INPUT, R> andThen(BankOperation<? super OUTPUT, ? extends R> after) {
        Objects.requireNonNull(after);
        return (INPUT input) -> after.doOperation(doOperation(input));
    }


    /**
     * Do something with the output from another operation.
     */
    default <R> BankOperation<R, OUTPUT> compose(BankOperation<? super R, ? extends INPUT> before) {
        Objects.requireNonNull(before);
        return (R input) -> doOperation(before.doOperation(input));
    }
}
