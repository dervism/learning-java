package no.dervis.learningjava.collections.linkedlist.complex.headtail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class LinkTailTest {

    @Test
    void data() {
        Link node = new Node("second");
        Link head = new LinkTail("first", node);
        assertNotSame(head, node);

        assertEquals("first", head.data());
        assertEquals("first", head.toString());
        assertEquals(node, head.link());
    }

}