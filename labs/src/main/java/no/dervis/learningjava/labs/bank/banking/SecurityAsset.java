package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

public class SecurityAsset implements Asset {

    private BigDecimal value;

    // can use these assets only if its value is higher than the loan applied
    public enum SecurityType {
        HOME,
        CAR,
        JEWELLERY
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
