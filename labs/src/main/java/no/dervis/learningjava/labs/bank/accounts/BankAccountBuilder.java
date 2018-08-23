package no.dervis.learningjava.labs.bank.accounts;

import no.dervis.learningjava.labs.bank.BankAccount;
import no.dervis.learningjava.labs.bank.BankAccountNumber;
import no.dervis.learningjava.labs.bank.BankCustomer;
import no.dervis.learningjava.labs.bank.faults.BankOperationException;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public interface BankAccountBuilder {

    static String randomBankAccountNumber() {
        Random random = new Random(System.nanoTime());

        return random.ints(11, 0, 10)
                .mapToObj(String::valueOf)
                .reduce((s, s2) -> s + s2)
                .orElseThrow(() -> new IllegalStateException("Could not generate account number."));
    }


    static <T extends BankAccount> T randomBankAccount(Class<T> accountType) {

        T t = null;
        try {
            t = accountType.getDeclaredConstructor(BankAccountNumber.class).newInstance(
                    new StandardBankAccountNumber( randomBankAccountNumber() )
            );
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new BankOperationException(e);
        }

        return t;
    }

    static <T extends BankAccount> T randomBankAccount(Class<T> accountType, BankCustomer customer) {

        T t = null;
        try {
            t = accountType.getDeclaredConstructor(BankAccountNumber.class, BankCustomer.class).newInstance(
                    new StandardBankAccountNumber( randomBankAccountNumber() ),
                    customer
            );
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new BankOperationException(e);
        }

        return t;
    }

}
