package no.dervis.learningjava.labs.bank;

import no.dervis.learningjava.labs.bank.accounts.BankAccountBuilder;
import no.dervis.learningjava.labs.bank.accounts.StandardBankAccount;

import java.math.BigDecimal;

import static no.dervis.learningjava.tools.Headers.printHeader;

public class BankMain {

    public static void main(String[] args) {
        System.out.println("BankMain.");
        printAccountTests();

    }

    private static void printAccountTests() {
        printHeader("Create bank account");
        System.out.println("Random account number: " + BankAccountBuilder.randomBankAccountNumber());

        StandardBankAccount bankAccount = StandardBankAccount.random();
        System.out.println("Random account: " + bankAccount);

        double money = 1000.0;
        printHeader("Deposit money: " + money);
        bankAccount.deposit(BigDecimal.valueOf(money));
        System.out.println(bankAccount);

        money = 450.0;
        printHeader("Withdraw money: " + money);
        bankAccount.withDraw(BigDecimal.valueOf(money));
        System.out.println(bankAccount);
    }

}
