package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

import java.util.Iterator;

/**
 * An implementation of an iterator for GenericLinkList.
 *
 * @author Dervis M
 */

public class GenericIteratorLinkList<T> implements Iterator<T> {

    private GenericLink<T> pointer;
    private int index;
    private final int size;

    public GenericIteratorLinkList(GenericLinkList<T> list) {
        this.pointer = list.first();
        this.size = list.size();
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        T value = pointer.data();
        pointer = pointer.link();
        index++;
        return value;
    }
}
