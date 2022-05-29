package no.dervis.learningjava.labs.bank.operations.withdraw;

import no.dervis.learningjava.labs.bank.faults.BankOperationException;
import no.dervis.learningjava.labs.bank.operations.BankOperation;
import no.dervis.learningjava.labs.bank.operations.outputs.BooleanOutput;

import java.util.Objects;

public class WithDrawMoneyImpl implements BankOperation<WithDrawMoneyInput, BooleanOutput> {

    @Override
    public BooleanOutput doOperation(WithDrawMoneyInput withDrawMoneyInput) throws BankOperationException {

        if (Objects.isNull(withDrawMoneyInput))
            throw new BankOperationException("Invalid input.");

        try {
            withDrawMoneyInput.getFromBankAccount().withDraw(withDrawMoneyInput.getAmount());
        } catch (BankOperationException e) {
            e.printStackTrace();
            return new BooleanOutput(false, e);
        }


        return new BooleanOutput(true);
    }

}
