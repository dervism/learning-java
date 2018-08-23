package no.dervis.learningjava.collections.linkedlist.doublelink;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoubleLinkedListIteratorTest {

    @Test
    void next() {
        StringBuilder builder = new StringBuilder();
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("first");
        list.addLast("second");
        list.addLast("third");

        DoubleLinkedListIterator<String> iterator = new DoubleLinkedListIterator<>(list);
        while(iterator.hasNext()) {
            String next = iterator.next();
            builder.append(next).append(iterator.hasNext() ? ',' : "");
            System.out.println(next);
        }

        Assertions.assertEquals("first,second,third", builder.toString());

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);
    }
}