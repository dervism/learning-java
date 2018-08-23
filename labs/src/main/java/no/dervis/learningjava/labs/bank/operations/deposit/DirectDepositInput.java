package no.dervis.learningjava.labs.bank.operations.deposit;

import no.dervis.learningjava.labs.bank.BankAccount;

import java.math.BigDecimal;

public class DirectDepositInput {

    private BigDecimal amount;

    private BankAccount toBankAccount;

    public DirectDepositInput(BigDecimal amount, BankAccount toBankAccount) {
        this.amount = amount;
        this.toBankAccount = toBankAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BankAccount getToBankAccount() {
        return toBankAccount;
    }

    @Override
    public String toString() {
        return "DirectDepositInput{" +
                "amount=" + amount +
                ", toBankAccount=" + toBankAccount +
                '}';
    }
}
