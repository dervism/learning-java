package no.dervis.learningjava.labs.coins;

public class Coin {

    private boolean heads;

    public Coin(boolean heads) {
        this.heads = heads;
    }

    public boolean isHeads() {
        return heads;
    }

    @Override
    public String toString() {
        return this.heads ? "H" : "T";
    }
}
