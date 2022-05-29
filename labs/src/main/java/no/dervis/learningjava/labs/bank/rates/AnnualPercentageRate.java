package no.dervis.learningjava.labs.bank.rates;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <a href="https://www.experian.com/blogs/ask-experian/what-is-apr/">APR</a>
 *
 * @param interestRateAnnual the annual interest rate
 */

public record AnnualPercentageRate(BigDecimal interestRateAnnual) {
    public static AnnualPercentageRate of(BigDecimal interestRateAnnual) {
        return new AnnualPercentageRate(interestRateAnnual);
    }

    public static AnnualPercentageRate of(double interestRateAnnual) {
        return new AnnualPercentageRate(BigDecimal.valueOf(interestRateAnnual));
    }

    public BigDecimal monthly() {
        return interestRateAnnual.divide(BigDecimal.valueOf(12D), RoundingMode.HALF_EVEN);
    }
}
