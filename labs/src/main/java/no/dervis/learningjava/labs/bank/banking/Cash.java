package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

public class Cash implements Asset {

    private BigDecimal value;

    public Cash(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getAssetValue() {
        return value;
    }

    public static BigDecimal cash(double amount) {
        return BigDecimal.valueOf(amount);
    }
}
