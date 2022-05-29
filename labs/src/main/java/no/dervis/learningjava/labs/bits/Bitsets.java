package no.dervis.learningjava.labs.bits;

import java.util.BitSet;
import java.util.Scanner;

public class Bitsets {

    public static void main(String[] args) {

        Scanner in = new Scanner(
                """
                        5 4
                        AND 1 2
                        SET 1 4
                        FLIP 2 2
                        OR 2 1
                        """
        );

        enum Inputs { AND, OR, XOR, FLIP, SET }
        int n = in.nextInt();
        int m = in.nextInt();

        BitSet set1 = new BitSet(n), set2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = in.next();
            int firstParam = in.nextInt();
            int secondParam = in.nextInt();
            Inputs op = Inputs.valueOf(operation);

            BitSet bb1 = set1, bb2 = set2;
            if (firstParam == 2) bb1 = set2;
            if (secondParam == 1) bb2 = set1;

            switch (op) {
                case AND -> bb1.and(bb2);
                case OR -> bb1.or(bb2);
                case XOR -> bb1.xor(bb2);
                case FLIP -> bb1.flip(secondParam);
                case SET -> bb1.set(secondParam);
            }

            System.out.println(set1.cardinality() + " " + set2.cardinality());
        }
    }

}
