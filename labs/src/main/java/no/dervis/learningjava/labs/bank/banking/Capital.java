package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

/**
 * Bank capital is the value of the bank's assets minus its liabilities, or debts.
 * Assets include cash, loans and securities, while liabilities cover customer deposits,
 * and money owed to other banks and bondholders.
 *
 * What is Capital:
 * Capital is used to absorb shocks during a bank's worst periods. Capital is important because
 * it's that part of an asset which can be used to repay its depositors, customers, and other claimants
 * in case the bank doesn't have enough liquidity due to losses it suffered in its operations.
 *
 * How banks earn money:
 * It all ties back to the fundamental way banks make money: Banks use depositors' money to make loans.
 * The amount of interest the banks collect on the loans is greater than the amount of interest they pay
 * to customers with savings accounts—and the difference is the banks' profit.
 *
 */

public interface Capital {

    BigDecimal getCapitalValue();

}
