package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

public class SecurityAsset implements Asset {

    private BigDecimal value;

    public enum SecurityType {
        HOME,
        JEWELLERY, CAR // can use these only if you owe less than the value
    }

    private SecurityType securityType;

    public SecurityAsset(BigDecimal value, SecurityType securityType) {
        this.value = value;
        this.securityType = securityType;
    }

    public SecurityAsset(BigDecimal value) {
        this.value = value;
        this.securityType = SecurityType.HOME;
    }

    @Override
    public BigDecimal getAssetValue() {
        return value;
    }
}
