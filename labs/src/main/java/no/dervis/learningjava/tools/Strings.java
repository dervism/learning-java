package no.dervis.learningjava.tools;

import java.util.LinkedList;
import java.util.List;

public class Strings {

    public static void printf(String s, Object... args) {
        System.out.printf(s + System.lineSeparator(), args);
    }

    public static List<String> printft(List<String> list, List<Timers> cols) {
        int maxLength = list.stream().mapToInt(String::length).max().orElse(0);
        List<String> newList = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            StringBuilder s = new StringBuilder(list.get(i));
            String time = cols.get(i).secondsStr();
            int diff = maxLength - s.length();
            if (diff > 0) {
                s.append(" ".repeat(Math.max(0, diff + 1)));
                newList.add(String.format(s + "%s", time));
            } else {
                newList.add(String.format(s + " %s", time));
            }
        }

        return newList;
    }

}
