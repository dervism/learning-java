package no.dervis.learningjava.labs.bank.accounts;

import no.dervis.learningjava.labs.bank.customer.BankCustomer;
import no.dervis.learningjava.labs.bank.faults.BankOperationException;
import no.dervis.learningjava.labs.bank.rates.AnnualPercentageYield;

import java.math.BigDecimal;

public class SavingsBankAccount extends StandardBankAccount {

    public SavingsBankAccount(BankAccountNumber bankAccountNumber, BankCustomer customer) {
        super(bankAccountNumber, customer);
    }

    public SavingsBankAccount(BankAccountNumber bankAccountNumber, BankCustomer customer, AnnualPercentageYield yieldRate) {
        super(bankAccountNumber, customer);
        setAPY(yieldRate);
    }

    public boolean payInterestsAnnual() throws BankOperationException {
        BigDecimal interests = getDepositAmount().multiply(getAPY().interestRateAnnual());
        return deposit(interests);
    }

    public boolean payInterestsMonthly() throws BankOperationException {
        BigDecimal interests = getDepositAmount().multiply(getAPY().monthly());
        return deposit(interests);
    }

    @Override
    public BankAccountType getType() {
        return BankAccountType.SAVINGS;
    }
}
