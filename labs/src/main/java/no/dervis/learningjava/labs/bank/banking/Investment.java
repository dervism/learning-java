package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;

public class Investment implements Asset, Capital {

    public enum InvestorType {
        PUBLIC_EQUITY,   // public markets, such as stock exchange
        PRIVATE_EQUITY,  // long-term investment from private funds
        HEDGE_FUND,      // short-term investment with high risk
        VENTURE_CAPITAL,  // financing that investors provide to startup's and SMB's with long-term growth potential
        INDIVIDUAL,
        BANK_INVESTMENT
    }

    public enum InvestmentType {
        STOCK, FUND, BOND, PROPERTY, PENSION, INSURANCE, STARTUP, MISC
    }

    private final InvestorType investorType;

    private final InvestmentType investmentType;

    private final BigDecimal value;

    private final String investorId;

    public Investment(BigDecimal value, String investorId) {
        this(InvestorType.INDIVIDUAL, InvestmentType.MISC, value, investorId);
    }

    public Investment(InvestorType investorType, BigDecimal value, String investorId) {
        this(investorType, InvestmentType.MISC, value, investorId);
    }

    public Investment(InvestmentType investmentType, BigDecimal value, String investorId) {
        this(InvestorType.INDIVIDUAL, investmentType, value, investorId);
    }

    public Investment(InvestorType investorType, InvestmentType investmentType, BigDecimal value, String investorId) {
        this.investorType = investorType;
        this.investmentType = investmentType;
        this.value = value;
        this.investorId = investorId;
    }

    @Override
    public BigDecimal getAssetValue() {
        return value;
    }

    /**
     * When this investment is used as capital for other businesses.
     *
     * @return the value when converted to money.
     */
    @Override
    public BigDecimal getCapitalValue() {
        return value;
    }

    public InvestorType getInvestorType() {
        return investorType;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    public String getInvestorId() {
        return investorId;
    }
}
