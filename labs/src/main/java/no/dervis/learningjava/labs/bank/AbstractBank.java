package no.dervis.learningjava.labs.bank;

import no.dervis.learningjava.labs.bank.banking.Asset;
import no.dervis.learningjava.labs.bank.banking.Capital;
import no.dervis.learningjava.labs.bank.banking.Cash;
import no.dervis.learningjava.labs.bank.banking.Liability;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static no.dervis.learningjava.labs.bank.banking.Cash.cash;

public class AbstractBank implements Bank{

    protected BigDecimal capital;

    protected List<BankAccount> bankAccounts;

    protected List<Asset> assets;

    protected List<Liability> liabilities;


    public AbstractBank(Capital... capital) {

        // convert initial capital to money
        this.capital = Arrays.asList(capital)
                .stream()
                .map(Capital::getCapitalValue)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.valueOf(0.0D));

        this.bankAccounts = new ArrayList<>();
        this.assets = new ArrayList<>();
        this.liabilities = new ArrayList<>();
    }

    @Override
    public void addCapital(Capital newCapital) {
        this.capital = capital.add(newCapital.getCapitalValue());
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
        assets = new ArrayList<>();
        assets.add(new Cash(capital));

        return assets;
    }

    /**
     * Liabilities cover customer deposits, and money owed to other banks and bondholders
     */
    @Override
    public List<Liability> getLiabilities() {
        liabilities = new ArrayList<>();
        liabilities.addAll(bankAccounts);

        return liabilities;
    }
}
