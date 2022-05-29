package no.dervis.learningjava.labs.bank.operations.transfer;

import no.dervis.learningjava.labs.bank.accounts.BankAccount;

import java.math.BigDecimal;

public class TransferMoneyInput {

    private final BigDecimal amount;

    private final BankAccount transferFromAccount;

    private final BankAccount transferToAccount;

    public TransferMoneyInput(BigDecimal amount, BankAccount transferFromAccount, BankAccount transferToAccount) {
        this.amount = amount;
        this.transferFromAccount = transferFromAccount;
        this.transferToAccount = transferToAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BankAccount getTransferToAccount() {
        return transferToAccount;
    }

    public BankAccount getTransferFromAccount() {
        return transferFromAccount;
    }
}
