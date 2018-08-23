package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

public interface GenericLink<T> {
    T data();
    GenericLink<T> link();
    void linkTo(GenericLink<T> link);
}
