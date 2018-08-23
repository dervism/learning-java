package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

/**
 * Liabilities cover customer deposits, and money owed to other banks and bondholders
 */

public interface Liability {

    BigDecimal getLiabilityValue();

}
