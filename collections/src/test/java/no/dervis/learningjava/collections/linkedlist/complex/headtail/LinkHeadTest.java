package no.dervis.learningjava.collections.linkedlist.complex.headtail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class LinkHeadTest {

    @Test
    void data() {
        Link head = new LinkHead("first");
        Link node = new Node("second");
        head.linkTo(node);
        assertNotSame(head, node);

        assertEquals("first", head.data());
        assertEquals("first", head.toString());
        assertEquals(node, head.link());
    }
}