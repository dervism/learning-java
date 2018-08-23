package no.dervis.learningjava.collections.linkedlist.doublelink;

import no.dervis.learningjava.collections.linkedlist.doublelink.DoubleLinkedList.DoubleLinkedItem;

import java.util.Iterator;

/**
 * An implementation of an iterator for GenericLinkList.
 *
 * @author Dervis M
 */

public class DoubleLinkedListIterator<T> implements Iterator<T> {

    private DoubleLinkedItem<T> pointer;
    private int index;
    private int size;

    public DoubleLinkedListIterator(DoubleLinkedList<T> list) {
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
        pointer = pointer.next();
        index++;
        return value;
    }
}
