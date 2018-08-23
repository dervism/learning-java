package no.dervis.learningjava.collections.linkedlist.simple;

import org.junit.jupiter.api.Test;

class SimpleLinkListTest {

    @Test
    void onlyOne() {
        SimpleLinkList list = new SimpleLinkList();
        list.addFirst("first");
        System.out.println(list);
    }

    @Test
    void removeItemThatExists() {
        SimpleLinkList list = new SimpleLinkList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        System.out.println("Before remove: " + list);

        list.remove("a");
        System.out.println("After remove: " + list);
    }

    @Test
    void addFirst() {
        SimpleLinkList list = new SimpleLinkList();
        list.addFirst("first");
        list.addFirst("second");
        list.addFirst("third");
        System.out.println(list);
    }

    @Test
    void addLast() {
        SimpleLinkList list = new SimpleLinkList();
        list.addLast("first");
        list.addLast("second");
        list.addLast("third");
        System.out.println(list);
    }

    @Test
    void addFirstAndLast() {
        SimpleLinkList list = new SimpleLinkList();
        list.addFirst("first");
        list.addLast("second");
        list.addFirst("third");
        System.out.println(list);
    }
}