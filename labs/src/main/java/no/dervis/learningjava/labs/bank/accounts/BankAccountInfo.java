package no.dervis.learningjava.labs.bank.accounts;

import no.dervis.learningjava.labs.bank.customer.BankCustomer;
import no.dervis.learningjava.labs.bank.rates.AnnualPercentageYield;

import java.time.LocalDateTime;

public class BankAccountInfo {

    private BankCustomer accountOwner;

    private final LocalDateTime dateCreated;

    private LocalDateTime dateEnded;

    private AnnualPercentageYield annualPercentageYield;

    public BankAccountInfo() {
        this(null, AnnualPercentageYield.of(0.005*12));
    }

    public BankAccountInfo(BankCustomer accountOwner, AnnualPercentageYield annualPercentageYield) {
        this.accountOwner = accountOwner;
        this.dateCreated = LocalDateTime.now();
        this.annualPercentageYield = annualPercentageYield;
    }

    public BankCustomer getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(BankCustomer accountOwner) {
        this.accountOwner = accountOwner;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(LocalDateTime dateEnded) {
        this.dateEnded = dateEnded;
    }

    public AnnualPercentageYield getAnnualPercentageYield() {
        return annualPercentageYield;
    }

    public void setAnnualPercentageYield(AnnualPercentageYield annualPercentageRate) {
        this.annualPercentageYield = annualPercentageRate;
    }

    @Override
    public String toString() {
        return "BankAccountInfo{" +
                "accountOwner=" + accountOwner +
                ", dateCreated=" + dateCreated +
                ", dateEnded=" + dateEnded +
                ", interestRateAnno=" + annualPercentageYield +
                '}';
    }
}
