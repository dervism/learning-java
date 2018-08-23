package no.dervis.learningjava.labs.bank.loan;

import no.dervis.learningjava.labs.bank.banking.Asset;
import no.dervis.learningjava.labs.bank.banking.Liability;

/**
 * Asset: a bank can give loan and get interests
 * Liability: A bank can take up loan from other banks
 */

public interface Loan extends Asset, Liability {

}
