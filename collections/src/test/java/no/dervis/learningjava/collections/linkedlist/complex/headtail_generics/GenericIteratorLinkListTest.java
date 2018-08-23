package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericIteratorLinkListTest {

    @Test
    void next() {
        StringBuilder builder = new StringBuilder();
        GenericLinkList<String> list = new GenericLinkList<>();
        list.addLast("first");
        list.addLast("second");
        list.addLast("third");

        GenericIteratorLinkList<String> iterator = new GenericIteratorLinkList<>(list);
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