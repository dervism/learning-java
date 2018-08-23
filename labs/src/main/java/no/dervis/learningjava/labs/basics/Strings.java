package no.dervis.learningjava.labs.basics;

import static no.dervis.learningjava.tools.Headers.printHeader;

public class Strings {


    public static void main(String[] args) {
        String helloWorld = "Hello, world!";
        System.out.println(helloWorld);

        printHeader("String concatenation:");
        String hello = "Hello, ";
        String world = "world!";
        String helloWorldConcatenated = hello + world;
        System.out.println(helloWorldConcatenated);

        String stringConcatenation = "Hello" + ", world!";
        System.out.println(stringConcatenation);

        printHeader("Using formatting and object arguments:");
        String helloPerson = "Hello, %s\n";
        System.out.printf(helloPerson, "Johanna");

        printHeader("Using literals and chars:");
        char[] literals = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        System.out.println(literals);
        System.out.println(new String(literals));
        System.out.println(new StringBuilder().append(literals));
    }

}
