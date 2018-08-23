package no.dervis.learningjava.labs.bank.operations.transfer;

import no.dervis.learningjava.labs.bank.BankAccount;

import java.math.BigDecimal;

public class TransferMoneyInput {

    private BigDecimal amount;

    private BankAccount transferFromAccount;

    private BankAccount transferToAccount;

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
