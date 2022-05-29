package no.dervis.learningjava.collections.linkedlist.complex.headtail;

public class Node implements Link {

    private final Object object;

    private Link next;

    public Node(Object object) {
        this.object = object;
    }

    public Node(Object object, Link next) {
        this.object = object;
        this.next = next;
    }

    @Override
    public Object data() {
        return object;
    }

    @Override
    public Link link() {
        return next;
    }

    @Override
    public void linkTo(Link link) {
        this.next = link;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
