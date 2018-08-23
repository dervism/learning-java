package no.dervis.learningjava.labs.bank.accounts;

import no.dervis.learningjava.labs.bank.BankCustomer;

import java.time.LocalDateTime;

public class BankAccountInfo {

    private BankCustomer accountOwner;

    private LocalDateTime dateCreated;

    private LocalDateTime dateEnded;

    private double interestRateAnno;

    public BankAccountInfo() {
        this(null, 0.5);
    }

    public BankAccountInfo(BankCustomer accountOwner, double interestRateAnno) {
        this.accountOwner = accountOwner;
        this.dateCreated = LocalDateTime.now();
        this.interestRateAnno = interestRateAnno;
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

    public double getInterestRateAnno() {
        return interestRateAnno;
    }

    public void setInterestRateAnno(double interestRateAnno) {
        this.interestRateAnno = interestRateAnno;
    }

    @Override
    public String toString() {
        return "BankAccountInfo{" +
                "accountOwner=" + accountOwner +
                ", dateCreated=" + dateCreated +
                ", dateEnded=" + dateEnded +
                ", interestRateAnno=" + interestRateAnno +
                '}';
    }
}
