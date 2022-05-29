package no.dervis.learningjava.labs.basics.loops;

import java.util.List;

import static no.dervis.learningjava.tools.Headers.printHeader;

public class ForEachLoop {

    public static void main(String[] args) {

        printHeader("For-Each loop - printing list of letters: ");
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        for (String letter : list) {
            System.out.println(letter + " ");
        }


        printHeader("For-Each loop - printing array of letters: ");
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (String letter : array) {
            System.out.println(letter + " ");
        }


        printHeader("For-Each loop - printing a 2D chess board: ");
        String[][] board = {
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
                {"a", "b", "c", "d", "e", "f", "g", "h"},
        };
        int rowNr = 1;
        for (String[] row : board) {
            for (String column : row) {
                System.out.print(column + "" + rowNr + " ");
            }
            rowNr++;
            System.out.println();
        }

    }

}
