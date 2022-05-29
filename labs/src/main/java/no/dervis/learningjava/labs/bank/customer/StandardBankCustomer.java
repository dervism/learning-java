package no.dervis.learningjava.labs.bank.customer;

import no.dervis.learningjava.labs.bank.accounts.BankAccount;
import no.dervis.learningjava.labs.bank.loan.Loan;

import java.util.List;

public class StandardBankCustomer implements BankCustomer {

    protected String name;

    protected List<BankAccount> bankAccounts;

    protected List<Loan> loans;

    public StandardBankCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean addBankAccount(BankAccount bankAccount) {
        return bankAccounts.add(bankAccount);
    }

    @Override
    public List<BankAccount> getAccounts() {
        return bankAccounts;
    }

    @Override
    public List<Loan> getLoans() {
        return loans;
    }

    public boolean addLoan(Loan loan) {
        return loans.add(loan);
    }
}
