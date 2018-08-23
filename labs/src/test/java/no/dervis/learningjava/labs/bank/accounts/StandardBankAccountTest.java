package no.dervis.learningjava.labs.bank.accounts;

import org.junit.jupiter.api.Test;

import static no.dervis.learningjava.labs.bank.banking.Cash.cash;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StandardBankAccountTest {

    @Test
    void withDraw() {
        StandardBankAccount testAccount = StandardBankAccount.random();
        testAccount.deposit(cash(1000));
        boolean withDraw = testAccount.withDraw(cash(450));

        assertTrue(withDraw);
        assertEquals(cash(550), testAccount.getDepositAmount());
    }

    @Test
    void deposit() {
        StandardBankAccount testAccount = StandardBankAccount.random();
        boolean deposit = testAccount.deposit(cash(1000));

        assertTrue(deposit);
        assertEquals(cash(1000), testAccount.getDepositAmount());
    }

    @Test
    void random() {
        StandardBankAccount testAccount = StandardBankAccount.random();
        assertNotNull(testAccount);
        System.out.println("Random account 1: " + testAccount);

        StandardBankAccount testAccount2 = StandardBankAccount.random(
                new StandardBankCustomer("Test")
        );

        assertNotNull(testAccount2);
    }


    @Test
    void bankAccountNr() {
        StandardBankAccount testAccount = StandardBankAccount.random();
        assertNotNull(testAccount.bankAccountNr());

        assertNotNull(testAccount.bankAccountNr().accountNr());
        assertFalse(testAccount.bankAccountNr().accountNr().isEmpty());

        assertNotNull(testAccount.bankAccountNr().ibanAccountNr());
        assertFalse(testAccount.bankAccountNr().ibanAccountNr().isEmpty());
    }

    @Test
    void getActivity() {
        StandardBankAccount testAccount = StandardBankAccount.random();
        testAccount.deposit(cash(1000));

        assertNotNull(testAccount.getActivity());
        assertEquals(1, testAccount.getActivity().size());

        testAccount.withDraw(cash(1000));
        assertEquals(2, testAccount.getActivity().size());
    }

    @Test
    void getBankAccountInfo() {
        StandardBankAccount testAccount = StandardBankAccount.random(
                new StandardBankCustomer("Test test")
        );

        assertEquals("Test test", testAccount.
                getBankAccountInfo().
                getAccountOwner().
                getName());

        assertNotNull(testAccount.getBankAccountInfo().getDateCreated());
    }
}