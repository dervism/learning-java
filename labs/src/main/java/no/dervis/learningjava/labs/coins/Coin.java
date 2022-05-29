package no.dervis.learningjava.labs.coins;

public record Coin(boolean heads) {

    @Override
    public String toString() {
        return this.heads ? "H" : "T";
    }
}
