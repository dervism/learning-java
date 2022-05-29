package no.dervis.learningjava.labs.bank.customer;

import no.dervis.learningjava.labs.bank.accounts.BankAccount;
import no.dervis.learningjava.labs.bank.loan.Loan;

import java.util.List;

public interface BankCustomer {

    String getName();

    List<BankAccount> getAccounts();

    List<Loan> getLoans();

}
