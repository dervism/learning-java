package no.dervis.learningjava.collections.linkedlist.complex.headtail_generics;

import java.util.Iterator;

import static no.dervis.learningjava.collections.linkedlist.complex.util.ListUtil.printList;

/**
 * An implementation of LinkedList that has custom head and tail objects, plus support iterator.
 *
 * Nodes ({@link GenericNode}) extend the {@link GenericLink} interface which makes it possible to add
 * a custom head node ({@link GenericLinkHead}) and a custom tail ({@link GenericLinkTail}).
 *
 * When adding/removing items from the list, the custom header and tail objects will also be updated
 * accordingly.
 *
 * @author Dervis M
 */

public class GenericLinkList<T> implements Iterable<T>{

    protected GenericLink<T> head;
    protected GenericLink<T> tail;
    protected int size;

    public void addFirst(T object) {
        head = new GenericLinkHead<>(object, head != null ? new GenericNode<>(head.data()) : null);
        tail = last();
        size++;
    }

    public void addLast(T object) {
        if (head == null) {
            addFirst(object);
        }
        else {
            if (size > 1) {
                GenericLink<T> parent = lastParent();
                GenericLink<T> currentLast = parent.link();
                parent.linkTo(new GenericNode<>(currentLast.data(), currentLast.link()));
                parent.link().linkTo(tail = new GenericLinkTail<>(object));
            } else {
                head.linkTo(new GenericLinkTail<>(object));
            }
            size++;
        }
    }

    public GenericLink<T> first() {
        return head;
    }

    public GenericLink<T> tail() {
        return tail;
    }

    public int size() {
        return size;
    }

    private GenericLink<T> last() {
        GenericLink<T> next = head;
        while (next.link() != null) {
            next = next.link();
        }
        return next;
    }

    public GenericLink<T> lastParent() {
        GenericLink<T> next = head;
        GenericLink<T> prev = head;
        while (next.link() != null) {
            prev = next;
            next = next.link();
        }
        return prev;
    }

    @Override
    public String toString() {
       return printList(this);
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericIteratorLinkList<>(this);
    }
}
