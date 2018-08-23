package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

public class GenericNode<T> implements GenericLink<T> {

    private T object;

    private GenericLink<T> next;

    public GenericNode(T object) {
        this.object = object;
    }

    public GenericNode(T object, GenericLink<T> next) {
        this.object = object;
        this.next = next;
    }

    @Override
    public T data() {
        return object;
    }

    @Override
    public GenericLink<T> link() {
        return next;
    }

    @Override
    public void linkTo(GenericLink<T> link) {
        this.next = link;
    }

    @Override
    public String toString() {
        return object.toString();
    }
}
