package no.dervis.learningjava.collections.linkedlist.complex.headtail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    @Test
    void emptyList() {
        LinkList list = new LinkList();
        assertNull(list.head);
        assertNull(list.tail);
    }

    @Test
    void insertFirst() {
        LinkList list = new LinkList();
        list.addFirst("first");

        assertEquals("first", list.first().data());
        assertEquals("first", list.tail().data());

        assertNotNull(list.head);
        assertNotNull(list.first());

        assertNotNull(list.tail);
        assertNotNull(list.tail());

        assertSame(list.first(), list.tail());
        assertEquals(list.first().data(), list.tail().data());
    }

    @Test
    void insertLast() {
        LinkList list = new LinkList();
        list.addLast("first");
        list.addLast("second");
        list.addLast("third");
        System.out.println(list);

        assertTrue(list.first() instanceof LinkHead);
        assertEquals("first", list.first().data());

        assertTrue(list.first().link() instanceof Node);
        assertEquals("second", list.first().link().data());

        assertTrue(list.tail() instanceof LinkTail);
        assertEquals("third", list.tail().data());

        assertEquals(3, list.size());
    }

    @Test
    void getLastParent() {
        LinkList list = new LinkList();
        list.addFirst("first");
        assertEquals("first", list.lastParent().data());

        list.addLast("second");
        assertEquals("first", list.lastParent().data());

        list.addLast("third");
        assertEquals("second", list.lastParent().data());

        System.out.println(list);
    }

}