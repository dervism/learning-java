package no.dervis.learningjava.labs.coins;

import no.dervis.learningjava.tools.Timers;

import java.util.*;
import java.util.stream.IntStream;

import static no.dervis.learningjava.tools.Strings.printft;
import static no.dervis.learningjava.tools.Timers.Time;
import static no.dervis.learningjava.tools.Timers.warmUp;

public class CoinToss {

    private final int rounds;
    private final Random random = new Random(System.currentTimeMillis());

    public CoinToss(int rounds) {
        this.rounds = rounds;
    }

    public Timers simulateCoinTossForLoopArray(boolean output) {
        Timers time = Time();

        boolean[] value = {true, false};
        Coin[] coins = new Coin[rounds];

        for (int i = 0; i < rounds; i++) {
            int side = random.nextInt(2);
            coins[i] = new Coin(value[side]);
        }
        time.end();

        if (output) System.out.println(Arrays.asList(coins));
        return time;
    }

    public Timers simulateCoinTossForLoopList(boolean output) {
        Timers time = Time();

        LinkedList<Coin> result = new LinkedList<>();
        for (int i = 0; i < rounds; i++) result.add(new Coin(random.nextBoolean()));

        time.end();

        if (output) System.out.println(result);
        return time;
    }

    public Timers simulateCoinTossIntStream(boolean output) {
        Timers time = Time();

        LinkedList<Coin> result = new LinkedList<>();
        IntStream
                .range(0, rounds)
                .forEach(round -> result.add(new Coin(random.nextBoolean())));
        time.end();

        if (output) System.out.println(result);
        return time;
    }

    public Timers simulateCoinTossIntStreamMapAndCollect(boolean output) {
        Timers time = Time();

        List<Coin> result = IntStream
                .range(0, rounds)
                .mapToObj(value -> new Coin(random.nextBoolean()))
                .toList();
        time.end();

        if (output) System.out.println(result);
        return time;
    }

    public static void main(String[] args) {
        int rounds = 1_000_000;
        boolean output = false;

        Map<String, Timers> map = new LinkedHashMap<>();
        warmUp();map.put("For Loop with LinkedList: ", new CoinToss(rounds).simulateCoinTossForLoopList(output));
        warmUp();map.put("InStream with LinkedList: ", new CoinToss(rounds).simulateCoinTossIntStream(output));
        warmUp();map.put("InStream Map/Collect: ", new CoinToss(rounds).simulateCoinTossIntStreamMapAndCollect(output));
        warmUp();map.put("For Loop with Array: ", new CoinToss(rounds).simulateCoinTossForLoopArray(output));

        printft(new ArrayList<>(map.keySet()), new ArrayList<>(map.values())).forEach(System.out::println);
    }

}
