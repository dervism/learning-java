package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

/**
 * Assets include cash, loans and securities
 */

public interface Asset {

    BigDecimal getAssetValue();

}
