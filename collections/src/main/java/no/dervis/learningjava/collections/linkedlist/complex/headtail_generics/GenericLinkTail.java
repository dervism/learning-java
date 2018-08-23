package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

public class GenericLinkTail<T> extends GenericNode<T> {

    public GenericLinkTail(T object) {
        super(object);
    }

    public GenericLinkTail(T object, GenericLink<T> next) {
        super(object, next);
    }

}
