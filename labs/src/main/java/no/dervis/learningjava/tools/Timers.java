package no.dervis.learningjava.tools;

import no.dervis.learningjava.labs.coins.Coin;

import java.text.DecimalFormat;

public class Timers {

    private long time;
    private long start;

    public static Timers Time() {
        return new Timers().start();
    }

    public Timers start() {
        this.start = System.nanoTime();
        return this;
    }

    public Timers end() {
        time = System.nanoTime() - start;
        return this;
    }

    public double millis() {
        return time / 1_000_000D / 1L;
    }

    /**
     * The built-in Java TimeUnit class converts only to long.
     * Another way of calculating is: TimeUnit.SECONDS.convert(time, TimeUnit.NANOSECONDS);
     */
    public double seconds() {
        return time / 1_000_000_000D / 1L;
    }

    public String secondsStr() {
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(6);

        return String.format("%s seconds (%s ms)", format.format(this.seconds()), Double.valueOf(this.millis()).intValue());
    }

    public String millisStr() {
        return this.millis() + " ms";
    }

    public static void warmUp() {
        for (int i = 0; i < 1_000_000; i++) {
            new Coin(true);
        }
    }
}
