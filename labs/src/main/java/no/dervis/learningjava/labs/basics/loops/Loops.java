package no.dervis.learningjava.labs.basics.loops;

import static no.dervis.learningjava.tools.Headers.printHeader;

public class Loops {

    public static void main(String[] args) {

        printHeader("Normal for loops: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + " ");
        }


        printHeader("Reversed count: ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


        printHeader("Positive numbers: ");
        for (int i = 0; i <= 10; i+=2) {
            System.out.print(i + " ");
        }


        printHeader("For loop without condition: ");
        for (int i = 0;;) {
            if (i == 0 || i % 2 == 0)
                System.out.print(i + " ");
            i++;
            if (i == 11) break;
        }


        printHeader("Nested loops - printing numbers: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("(x=%s,y=%s)", i, j);
            }
            System.out.println();
        }


        printHeader("Nested loops 2 - printing a chess board: ");
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
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "" + i + " ");
            }
            System.out.println();
        }

    }

}
