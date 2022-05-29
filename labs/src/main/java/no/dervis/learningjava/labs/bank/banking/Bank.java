package no.dervis.learningjava.labs.bank.banking;

import java.math.BigDecimal;
import java.util.List;

public interface Bank {

    void addCapital(Capital newCapital);

    void addLiability(Liability liability);

    BigDecimal getBankCapital();

    List<Asset> getAssets();

    List<Liability> getLiabilities();

}
