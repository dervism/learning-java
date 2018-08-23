package no.dervis.learningjava.labs.bank;

import no.dervis.learningjava.labs.bank.banking.Liability;
import no.dervis.learningjava.labs.bank.faults.BankOperationException;

import java.math.BigDecimal;

/**
 * Liability: the bank has to pay interest to depositor
 */

public interface BankAccount extends Liability {

    enum TYPE {
        STANDARD, SAVINGS, CREDIT
    }

    BigDecimal getDepositAmount();

    BankAccountNumber bankAccountNr();

    boolean deposit(BigDecimal amount) throws BankOperationException;

    boolean withDraw(BigDecimal amount) throws BankOperationException;

}
