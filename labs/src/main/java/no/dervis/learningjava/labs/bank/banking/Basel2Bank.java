package no.dervis.learningjava.labs.bank.banking;

import no.dervis.learningjava.labs.bank.accounts.BankAccount;

import java.math.BigDecimal;

/**
 * A bank implementation that should calculate risk according
 * to the Basel banking framework to determine minimum capital requirement.
 *
 * The more significant the risk a bank is exposed to, the greater the amount of capital the bank
 * needs to hold to safeguard its solvency and overall economic stability. Basel II attempted to
 * accomplish this by establishing risk and capital management requirements to ensure that a bank
 * has adequate capital for the risk the bank exposes itself to through its lending, investment
 * and trading activities. (Wikipedia)
 */

public class Basel2Bank extends AbstractBank {

    public Basel2Bank(Capital capital) {
        super(capital);
    }

    public BigDecimal calculateDepositCapital() {
        return this.bankAccounts
                .stream()
                .map(BankAccount::getDepositAmount)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.valueOf(0.0D));
    }

}
