package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericLinkTailTest {

    @Test
    void data() {
        GenericLinkTail<String> node = new GenericLinkTail<>("Test");
        assertEquals("Test", node.data());

        GenericLinkTail<Integer> node2 = new GenericLinkTail<>(1234);
        assertEquals(Integer.valueOf(1234), node2.data());

        GenericLinkTail<Long> node3 = new GenericLinkTail<>(Long.MAX_VALUE);
        assertEquals(Long.valueOf(Long.MAX_VALUE), node3.data());

        GenericLinkTail<BigDecimal> node4 = new GenericLinkTail<>(BigDecimal.valueOf(1234.12));
        assertEquals(BigDecimal.valueOf(1234.12), node4.data());
    }

    @Test
    void link() {
        GenericLinkTail<String> node2 = new GenericLinkTail<>("Test");
        GenericLinkTail<String> node = new GenericLinkTail<>("Test", node2);

        assertEquals(node2, node.link());
    }

    @Test
    void toStringTest() {
        GenericLinkTail<String> node = new GenericLinkTail<>("Test");
        assertEquals("Test", node.toString());
    }

}