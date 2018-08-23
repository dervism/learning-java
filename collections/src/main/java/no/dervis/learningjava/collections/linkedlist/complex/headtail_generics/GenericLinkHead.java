package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

public class GenericLinkHead<T> extends GenericNode<T> {

    public GenericLinkHead(T object) {
        super(object);
    }

    public GenericLinkHead(T object, GenericLink<T> next) {
        super(object, next);
    }
}
