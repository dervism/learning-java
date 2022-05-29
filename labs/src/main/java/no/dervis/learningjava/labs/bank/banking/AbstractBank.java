package no.dervis.learningjava.labs.bank.banking;

import no.dervis.learningjava.labs.bank.accounts.BankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static no.dervis.learningjava.labs.bank.banking.Cash.cash;

public class AbstractBank implements Bank {

    protected BigDecimal capital;

    protected List<BankAccount> bankAccounts;

    protected List<Asset> assets;

    protected List<Liability> liabilities;

    public AbstractBank(Capital... capital) {
        this(new ArrayList<>(), capital);
    }

    public AbstractBank(List<Liability> liabilities, Capital... capital) {

        // convert initial capital to money
        this.capital = Arrays
                .stream(capital)
                .map(Capital::getCapitalValue)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.valueOf(0.0D));

        this.bankAccounts = new ArrayList<>();
        this.assets = new ArrayList<>();
        this.liabilities = liabilities;
    }

    @Override
    public void addCapital(Capital newCapital) {
        this.capital = capital.add(newCapital.getCapitalValue());
    }

    @Override
    public void addLiability(Liability liability) {
        this.liabilities.add(liability);
    }

    /**
     * Bank Capital is the value of the bank's assets minus its liabilities, or debts.
     * Assets include cash, loans and securities, while liabilities cover customer deposits
     * and money owed to other banks and bondholders.
     */
    @Override
    public BigDecimal getBankCapital() {
        BigDecimal totalAssetValue = getAssets()
                .stream()
                .map(Asset::getAssetValue)
                .reduce(BigDecimal::add)
                .orElse(cash(0));

        BigDecimal totalLiabilities = getLiabilities()
                .stream()
                .map(Liability::getLiabilityValue)
                .reduce(BigDecimal::add)
                .orElse(cash(0));

        return totalAssetValue.subtract(totalLiabilities);
    }

    /**
     * Assets include cash, loans and securities
     */
    @Override
    public List<Asset> getAssets() {
        return Stream
                .concat(Stream.of(new Cash(capital)),
                        assets.stream())
                .collect(Collectors.toList());
    }

    /**
     * Liabilities cover customer deposits (including interest rates),
     * money owed to other banks, and bondholders.
     */
    @Override
    public List<Liability> getLiabilities() {
        return Stream
                .concat(bankAccounts.stream(),
                        liabilities.stream())
                .collect(Collectors.toList());
    }
}
