package no.dervis.learningjava.labs.bank.accounts;

import no.dervis.learningjava.labs.bank.banking.Cash;
import no.dervis.learningjava.labs.bank.customer.BankCustomer;
import no.dervis.learningjava.labs.bank.faults.BankOperationException;
import no.dervis.learningjava.labs.bank.rates.AnnualPercentageYield;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StandardBankAccount implements BankAccount {

    protected BankAccountInfo bankAccountInfo;

    protected BankAccountNumber bankAccountNumber;

    protected List<Cash> activity;

    protected BigDecimal account;

    public StandardBankAccount(BankAccountNumber bankAccountNumber, BankCustomer customer) {
        this.bankAccountInfo = new BankAccountInfo(customer, AnnualPercentageYield.of(0.005));
        this.bankAccountNumber = bankAccountNumber;
        this.activity = new ArrayList<>();
        this.account = BigDecimal.valueOf(0.0D);
    }

    @Override
    public BigDecimal getLiabilityValue() {
        return getDepositAmount();
    }

    @Override
    public boolean deposit(BigDecimal amount) throws BankOperationException {
        account = account.add(amount);
        activity.add(new Cash(amount));
        return true;
    }

    @Override
    public boolean withDraw(BigDecimal amount) throws BankOperationException {

        if (account.doubleValue() < amount.doubleValue()) {
            throw new BankOperationException("Not enough money in account.");
        }

        account = account.subtract(amount);
        activity.add(new Cash(amount.negate()));

        return true;
    }

    @Override
    public BankAccountType getType() {
        return BankAccountType.STANDARD;
    }

    @Override
    public AnnualPercentageYield getAPY() {
        return bankAccountInfo.getAnnualPercentageYield();
    }

    public void setAPY(AnnualPercentageYield annualPercentageYield) {
        this.bankAccountInfo.setAnnualPercentageYield(annualPercentageYield);
    }

    public static StandardBankAccount random() {
        return BankAccountBuilder.randomBankAccount(StandardBankAccount.class);
    }

    public static StandardBankAccount random(BankCustomer customer) {
        return BankAccountBuilder.randomBankAccount(StandardBankAccount.class, customer);
    }

    @Override
    public BigDecimal getDepositAmount() {
        return account;
    }

    @Override
    public BankAccountNumber bankAccountNr() {
        return bankAccountNumber;
    }

    public List<Cash> getActivity() {
        return activity;
    }

    public BankAccountInfo getBankAccountInfo() {
        return bankAccountInfo;
    }

    @Override
    public String toString() {
        return "StandardBankAccount{" +
                "bankAccountInfo=" + bankAccountInfo +
                ", bankAccountNumber=" + bankAccountNumber +
                ", activity (size)=" + activity.size() +
                ", account=" + account +
                '}';
    }
}
