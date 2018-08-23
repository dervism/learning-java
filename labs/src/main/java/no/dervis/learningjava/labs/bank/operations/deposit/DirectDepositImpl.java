package no.dervis.learningjava.labs.bank.operations.deposit;

import no.dervis.learningjava.labs.bank.BankOperation;
import no.dervis.learningjava.labs.bank.faults.BankOperationException;
import no.dervis.learningjava.labs.bank.operations.outputs.BooleanOutput;

import java.util.Objects;

public class DirectDepositImpl implements BankOperation<DirectDepositInput, BooleanOutput> {

    @Override
    public BooleanOutput doOperation(DirectDepositInput directDepositInput) throws BankOperationException {

        if (Objects.isNull(directDepositInput))
            throw new BankOperationException("Invalid input.");

        try {
            directDepositInput.getToBankAccount().deposit(directDepositInput.getAmount());
        } catch (BankOperationException e) {
            e.printStackTrace();
            return new BooleanOutput(false, e);
        }

        return new BooleanOutput(true);
    }
}
