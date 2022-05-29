package no.dervis.learningjava.labs.bank.accounts;

public class StandardBankAccountNumber implements BankAccountNumber {

    private final String iban;

    private final String accountNr;

    public StandardBankAccountNumber(String accountNr) {
        this.accountNr = accountNr;
        this.iban = accountNr;
    }

    public StandardBankAccountNumber(String iban, String accountNr) {
        this.iban = iban;
        this.accountNr = accountNr;
    }

    @Override
    public String ibanAccountNr() {
        return iban;
    }

    @Override
    public String accountNr() {
        return accountNr;
    }

    @Override
    public String toString() {
        return "StandardBankAccountNumber{" +
                "iban='" + iban + '\'' +
                ", accountNr='" + accountNr + '\'' +
                '}';
    }
}
