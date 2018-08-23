package no.dervis.learningjava.tools;

import java.util.Collections;
import java.util.stream.IntStream;

public class Headers {

    public static void printHeader(String s) {
        printHeader(s, 2);
    }

    public static void printHeader(String s, int newlines) {
        IntStream.range(0, newlines).forEach(value -> System.out.println());
        System.out.println(s);
        Collections.nCopies(s.length(), '-').forEach(System.out::print);
        System.out.println();
    }

}
