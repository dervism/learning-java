package no.dervis.learningjava.labs.nine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nine {

    public static void main(String[] args) {
        calcNine();
    }

    public static void calcNine() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            StringBuilder delta = new StringBuilder();
            delta.append("\n");
            reduce(9 * i, delta);
            System.out.println(delta);
        });
    }

    public static int reduce(int m, StringBuilder delta) {

        if (String.valueOf(m).length() == 1) return m;

        String[] s = String.valueOf(m).split("");

        List<Integer> list = new ArrayList<>();

        for (String d : s) list.add(Integer.valueOf(d));
        Iterator<Integer> iter = list.iterator();

        List<String> strings = Arrays.asList(s);
        //strings.stream().mapToInt(Integer::parseInt).collect(Collectors.toList())

        while (iter.hasNext()) {
            if (iter.hasNext()) delta.append(iter.next()).append(" + ");
            else delta.append(iter.next()).append(" = ");
        }

        Integer deltaResult = list.stream()
                .reduce((i1, i2) -> i1 + i2)
                .orElse(0);

        delta.append(deltaResult).append(" - ");

        return reduce(
                deltaResult
        , delta);
    }


}
