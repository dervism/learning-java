package no.dervis.learningjava.labs.bank.accounts;

import no.dervis.learningjava.labs.bank.faults.BankOperationException;

import java.math.BigDecimal;

public class SavingsBankAccount extends StandardBankAccount {

    public final BigDecimal ANNUAL_INTEREST_RATE = BigDecimal.valueOf(0.5);

    public SavingsBankAccount(BankAccountNumber bankAccountNumber) {
        super(bankAccountNumber);
    }

    public boolean payInterestsAnnual() throws BankOperationException {
        BigDecimal interests = getDepositAmount().multiply(ANNUAL_INTEREST_RATE);
        return deposit(interests);
    }

    public boolean payInterestsMonthly() throws BankOperationException {
        BigDecimal interests = getDepositAmount().multiply(BigDecimal.valueOf(ANNUAL_INTEREST_RATE.doubleValue() / 12D));
        return deposit(interests);
    }
}
