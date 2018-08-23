package no.dervis.learningjava.labs.basics;

import static no.dervis.learningjava.tools.Headers.printHeader;
import static no.dervis.learningjava.tools.Strings.printf;

public class Integers {

    public static void main(String[] args) {

        printHeader("Adding two numbers:");

        int x = 10;
        int y = 2;
        int z = x + y;

        printf("x + y = %s", z);


        printHeader("Subtracting two numbers:");

        x = 10;
        y = 2;
        z = x - y;

        printf("x - y = %s", z);


        printHeader("Dividing two numbers:");

        int k = 10;
        int l = 2;
        int i = k / l;

        printf("k / l = %s", i);


        printHeader("Multiple two numbers:");

        int q = 10;
        int r = 2;
        int t = q * r;

        printf("q * r = %s", t);
    }

}
