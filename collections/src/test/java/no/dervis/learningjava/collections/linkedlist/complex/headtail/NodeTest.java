package no.dervis.learningjava.collections.linkedlist.complex.headtail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class NodeTest {

    @Test
    void equalsFalse() {
        Link head = new Node("first");
        Link node = new Node("first");
        head.linkTo(node);
        assertNotSame(head, node);

        assertEquals("first", head.data());
        assertEquals("first", head.toString());
        assertEquals(node, head.link());
    }

}