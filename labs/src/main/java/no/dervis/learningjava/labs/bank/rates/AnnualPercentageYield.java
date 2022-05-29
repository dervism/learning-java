package no.dervis.learningjava.labs.bank.rates;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <a href="https://www.experian.com/blogs/ask-experian/what-is-apr/">APR</a>
 * APY:  APY is used by banks and credit unions to represent the interest
 * you earn on a deposit account
 *
 * @param interestRateAnnual the annual interest rate
 */

public record AnnualPercentageYield(BigDecimal interestRateAnnual) {
    public static AnnualPercentageYield of(BigDecimal interestRateAnnual) {
        return new AnnualPercentageYield(interestRateAnnual);
    }

    public static AnnualPercentageYield of(double interestRateAnnual) {
        return new AnnualPercentageYield(BigDecimal.valueOf(interestRateAnnual));
    }

    public BigDecimal monthly() {
        return interestRateAnnual.divide(BigDecimal.valueOf(12D), RoundingMode.HALF_EVEN);
    }
}
