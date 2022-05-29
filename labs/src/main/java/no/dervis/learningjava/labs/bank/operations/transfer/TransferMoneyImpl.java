package no.dervis.learningjava.labs.bank.operations.transfer;

import no.dervis.learningjava.labs.bank.faults.BankOperationException;
import no.dervis.learningjava.labs.bank.operations.BankOperation;
import no.dervis.learningjava.labs.bank.operations.deposit.DirectDepositImpl;
import no.dervis.learningjava.labs.bank.operations.deposit.DirectDepositInput;
import no.dervis.learningjava.labs.bank.operations.outputs.BooleanOutput;
import no.dervis.learningjava.labs.bank.operations.withdraw.WithDrawMoneyImpl;
import no.dervis.learningjava.labs.bank.operations.withdraw.WithDrawMoneyInput;

import java.util.Objects;

public class TransferMoneyImpl implements BankOperation<TransferMoneyInput, BooleanOutput> {

    @Override
    public BooleanOutput doOperation(TransferMoneyInput transferMoneyInput) throws BankOperationException {

        if (Objects.isNull(transferMoneyInput))
            throw new BankOperationException("Invalid input.");

        // take out money from sender
        WithDrawMoneyImpl withDrawMoneyService = new WithDrawMoneyImpl();
        BooleanOutput withDrawOutput = withDrawMoneyService.doOperation(
                new WithDrawMoneyInput(transferMoneyInput.getAmount(), transferMoneyInput.getTransferFromAccount())
        );

        // deposit it to the receiver
        DirectDepositImpl directDepositService = new DirectDepositImpl();
        BooleanOutput depositOutput = directDepositService.doOperation(
                new DirectDepositInput(transferMoneyInput.getAmount(), transferMoneyInput.getTransferToAccount())
        );

        return new BooleanOutput(withDrawOutput.isSuccess() && depositOutput.isSuccess());
    }
}
