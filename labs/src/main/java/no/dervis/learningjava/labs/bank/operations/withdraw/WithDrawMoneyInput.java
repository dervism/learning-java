package no.dervis.learningjava.labs.bank.operations.withdraw;

import no.dervis.learningjava.labs.bank.accounts.BankAccount;

import java.math.BigDecimal;

public class WithDrawMoneyInput {

    private final BigDecimal amount;

    private final BankAccount fromBankAccount;

    public WithDrawMoneyInput(BigDecimal amount, BankAccount fromBankAccount) {
        this.amount = amount;
        this.fromBankAccount = fromBankAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BankAccount getFromBankAccount() {
        return fromBankAccount;
    }

    @Override
    public String toString() {
        return "WithDrawMoneyInput{" +
                "amount=" + amount +
                ", fromBankAccount=" + fromBankAccount +
                '}';
    }
}
