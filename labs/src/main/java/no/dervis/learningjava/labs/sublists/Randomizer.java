package no.dervis.learningjava.labs.sublists;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Randomizer {
    static String randomizer(int bound) {
        Random random = new Random(1019);

        int m = random.nextInt(1, bound +1);

        System.out.printf("N=%s M=%s %n", bound, m);

        String input = IntStream.rangeClosed(1, bound)
                .mapToObj(i -> random.nextInt(1, 10_000_000))
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        return bound + " " + m + " " + input;
    }
}
