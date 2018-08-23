package no.dervis.learningjava.collections.linkedlist.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericSimpleLinkListTest {

    @Test
    void addFirst() {
        GenericSimpleLinkList<String> list = new GenericSimpleLinkList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        assertEquals("[C, B, A]", list.toString());
    }

    @Test
    void addFirstOne() {
        GenericSimpleLinkList<String> list = new GenericSimpleLinkList<>();
        list.addFirst("A");
        assertEquals("[A]", list.toString());
    }

    @Test
    void addFirstTwo() {
        GenericSimpleLinkList<String> list = new GenericSimpleLinkList<>();
        list.addFirst("A");
        list.addFirst("B");
        assertEquals("[B, A]", list.toString());
    }

    @Test
    void addLast() {
        GenericSimpleLinkList<String> list = new GenericSimpleLinkList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        assertEquals("[A, B, C]", list.toString());
    }

    @Test
    void addLastOne() {
        GenericSimpleLinkList<String> list = new GenericSimpleLinkList<>();
        list.addLast("A");
        assertEquals("[A]", list.toString());
    }

    @Test
    void addLastTwo() {
        GenericSimpleLinkList<String> list = new GenericSimpleLinkList<>();
        list.addLast("A");
        list.addLast("B");
        assertEquals("[A, B]", list.toString());
    }
}