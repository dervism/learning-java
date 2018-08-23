package no.dervis.learningjava.collections.linkedlist.doublelink;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void addFirst() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        assertEquals("C", list.first().data());
        assertEquals("B", list.first().next().data());
        assertEquals("[C, B, A]", list.toString());
        assertNotNull(list.iterator());

        DoubleLinkedList.DoubleLinkedItem<String> last = list.last();
        assertEquals("A", last.data());
        assertEquals("A", last.toString());
        assertEquals("B", last.previous().data());
    }

    @Test
    void addFirstOne() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addFirst("A");
        assertEquals("[A]", list.toString());
    }

    @Test
    void addFirstTwo() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        assertEquals("[B, A]", list.toString());
    }

    @Test
    void addLast() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        assertEquals("[A, B, C]", list.toString());
    }

    @Test
    void addLastOne() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("A");
        assertEquals("[A]", list.toString());
    }

    @Test
    void addLastTwo() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("A");
        list.addLast("B");
        assertEquals("[A, B]", list.toString());
    }

    @Test
    void addAfterWithIndex() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addAfter(0, "A");
        list.addLast("B");
        list.addAfter(0, "C");
        assertEquals("[A, C, B]", list.toString());

        list.addAfter(1, "D");
        assertEquals("[A, C, D, B]", list.toString());

        list.addAfter(3, "E");
        assertEquals("[A, C, D, B, E]", list.toString());

        assertThrows(IndexOutOfBoundsException.class, () -> list.addAfter(10, "F"));
    }

    @Test
    void addAfterWithItem() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("A");
        list.addLast("B");

        list.addAfter("A", "C");
        assertEquals("[A, C, B]", list.toString());

        list.addAfter("A", "D");
        assertEquals("[A, D, C, B]", list.toString());

        list.addAfter("B", "E");
        assertEquals("[A, D, C, B, E]", list.toString());
    }

    @Test
    void addBeforeWithIndex() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("A");
        list.addLast("B");

        list.addBefore(0, "C");
        assertEquals("[C, A, B]", list.toString());

        list.addBefore(1, "D");
        assertEquals("[C, D, A, B]", list.toString());

        list.addBefore(3, "E");
        assertEquals("[C, D, A, E, B]", list.toString());

        assertThrows(IndexOutOfBoundsException.class, () -> list.addBefore(10, "F"));
    }

    @Test
    void addBeforeWithItem() {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addLast("A");
        list.addLast("B");

        list.addBefore("A", "C");
        assertEquals("[C, A, B]", list.toString());

        list.addBefore("A", "D");
        assertEquals("[C, D, A, B]", list.toString());

        list.addBefore("B", "E");
        assertEquals("[C, D, A, E, B]", list.toString());
    }

    @Test
    void addAfter() {

    }
}