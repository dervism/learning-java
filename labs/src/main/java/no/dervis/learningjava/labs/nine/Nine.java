package no.dervis.learningjava.labs.nine;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nine {

    public static void main(String[] args) {
        calcNine();
    }

    public static void calcNine() {
        int multiplier = 9;

        IntStream.rangeClosed(1, 100).forEach(i -> {
            StringBuilder delta = new StringBuilder();
            int multiplied = multiplier * i;
            delta.append("\n").append(multiplier + " * " + i + " = " + multiplied + " > ");
            reduce(multiplied, delta);
            System.out.println(delta);
        });
    }

    public static int reduce(int partialResult, StringBuilder delta) {

        if (String.valueOf(partialResult).length() == 1) return partialResult;

        String[] chars = String.valueOf(partialResult).split("");

        for (int i = 0; i < chars.length-1; i++) delta.append(chars[i]).append(" + ");
        delta.append(chars[chars.length-1]).append(" = ");

        List<String> strings = Arrays.asList(chars);
        List<Integer> ints = strings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());


        Integer deltaResult = ints.stream()
                .reduce((i1, i2) -> i1 + i2)
                .orElse(0);

        if (String.valueOf(deltaResult).length() == 1) delta.append(deltaResult);
        else delta.append(deltaResult).append(" -> ");

        return reduce(deltaResult , delta);
    }

}
