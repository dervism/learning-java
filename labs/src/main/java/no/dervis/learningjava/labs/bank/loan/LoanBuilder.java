package no.dervis.learningjava.labs.bank.loan;

import no.dervis.learningjava.labs.bank.BankCustomer;
import no.dervis.learningjava.labs.bank.banking.Asset;

public class LoanBuilder {

    private Loan loan;

    public LoanBuilder() {

    }


    public LoanBuilder withCustomer(BankCustomer customer) {

        return this;
    }

    public LoanBuilder withInterestRate(double rate) {

        return this;
    }

    public LoanBuilder withLength(int years) {

        return this;
    }

    public LoanBuilder withSecurity(Asset security) {

        return this;
    }

}
