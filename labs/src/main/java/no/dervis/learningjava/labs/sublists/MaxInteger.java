package no.dervis.learningjava.labs.sublists;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class MaxInteger {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        String s = Randomizer.randomizer(100_000);
        Scanner in = new Scanner(Objects.requireNonNull(MaxInteger.class.getResourceAsStream("/testcase1.txt")));

        process4(in);
    }

    public static void process3(Scanner in) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(1000);
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        HashSet<Integer> set = new HashSet<>(m, 1);
        for (int i = 0; i < n; i++) {
            deque.add(in.nextInt());
            if (deque.size() == m) {
                set.addAll(deque);
                max = Math.max(set.size(), max);
                deque.pop();
                set.clear();
            }
        }

        System.out.println(max);
    }

    /**
     * No if-branching
     */
    public static void process4(Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        int max;

        ArrayDeque<Integer> deque = new ArrayDeque<>(1000);
        HashSet<Integer> set = new HashSet<>(m, 1);

        for (int i = 0; i < m; i++)
            deque.add(in.nextInt());

        set.addAll(deque);
        max = set.size();
        deque.pop();

        for (int i = m; i < n; i++) {
            set.clear();
            deque.add(in.nextInt());
            set.addAll(deque);
            max = Math.max(set.size(), max);
            deque.pop();
        }

        System.out.println(max);
    }
}
