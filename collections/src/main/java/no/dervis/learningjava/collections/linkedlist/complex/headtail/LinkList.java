package no.dervis.learningjava.collections.linkedlist.complex.headtail;

import no.dervis.learningjava.collections.linkedlist.complex.util.ListUtil;

/**
 * An implementation of LinkedList that has custom head and tail objects.
 *
 * Nodes ({@link Node}) extend the {@link Link} interface which makes it possible to add
 * a custom head node ({@link LinkHead}) and a custom tail ({@link LinkTail}).
 *
 * When adding/removing items from the list, the custom header and tail objects will also be updated
 * accordingly.
 *
 * @author Dervis M
 */

public class LinkList {

    protected Link head;
    protected Link tail;
    protected int size;

    public void addFirst(Object object) {
        if (head != null) head = new Node(head.data());
        head = new LinkHead(object, head); // right side is evaluated first
        tail = last();
        size++;
    }

    public void addLast(Object object) {
        if (head == null) {
            addFirst(object);
        }
        else {
            if (size > 1) {
                Link parent = lastParent();
                Link currentLast = parent.link();
                parent.linkTo(new Node(currentLast.data(), currentLast.link()));
                parent.link().linkTo(tail = new LinkTail(object));
            } else {
                head.linkTo(new LinkTail(object));
            }
            size++;
        }
    }

    public Link first() {
        return head;
    }

    public Link tail() {
        return tail;
    }

    public int size() {
        return size;
    }

    private Link last() {
        Link next = head;
        while (next.link() != null) {
            next = next.link();
        }
        return next;
    }

    public Link lastParent() {
        Link next = head;
        Link prev = head;
        while (next.link() != null) {
            prev = next;
            next = next.link();
        }
        return prev;
    }

    @Override
    public String toString() {
        return ListUtil.printList(this);
    }

}
