package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericNodeTest {

    @Test
    void data() {
        GenericNode<String> node = new GenericNode<>("Test");
        assertEquals("Test", node.data());

        GenericNode<Integer> node2 = new GenericNode<>(1234);
        assertEquals(Integer.valueOf(1234), node2.data());

        GenericNode<Long> node3 = new GenericNode<>(Long.MAX_VALUE);
        assertEquals(Long.valueOf(Long.MAX_VALUE), node3.data());

        GenericNode<BigDecimal> node4 = new GenericNode<>(BigDecimal.valueOf(1234.12));
        assertEquals(BigDecimal.valueOf(1234.12), node4.data());
    }

    @Test
    void link() {
        GenericNode<String> node = new GenericNode<>("Test");
        GenericNode<String> node2 = new GenericNode<>("Test");
        node.linkTo(node2);

        assertEquals(node2, node.link());
    }

    @Test
    void toStringTest() {
        GenericNode<String> node = new GenericNode<>("Test");
        assertEquals("Test", node.toString());
    }
}