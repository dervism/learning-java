package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericLinkHeadTest {

    @Test
    void data() {
        GenericLinkHead<String> node = new GenericLinkHead<>("Test");
        assertEquals("Test", node.data());

        GenericLinkHead<Integer> node2 = new GenericLinkHead<>(1234);
        assertEquals(Integer.valueOf(1234), node2.data());

        GenericLinkHead<Long> node3 = new GenericLinkHead<>(Long.MAX_VALUE);
        assertEquals(Long.valueOf(Long.MAX_VALUE), node3.data());

        GenericLinkHead<BigDecimal> node4 = new GenericLinkHead<>(BigDecimal.valueOf(1234.12));
        assertEquals(BigDecimal.valueOf(1234.12), node4.data());
    }

    @Test
    void link() {
        GenericLinkHead<String> node = new GenericLinkHead<>("Test");
        GenericLinkHead<String> node2 = new GenericLinkHead<>("Test");
        node.linkTo(node2);

        assertEquals(node2, node.link());
    }

    @Test
    void toStringTest() {
        GenericLinkHead<String> node = new GenericLinkHead<>("Test");
        assertEquals("Test", node.toString());
    }

}