package no.dervis.learningjava.collections.linkedlist.simple;

/**
 * A simple implementation of a LinkedList with generics.
 *
 * @author Dervis M
 */

public class GenericSimpleLinkList<T> {

    private int size;
    private Item<T> first;
    private Item<T> last;

    public void addFirst(T item) {
        Item<T> current = first;
        Item<T> newItem = new Item<>(item, null);
        first = newItem;
        if (current == null) {
            last = newItem;
        } else {
            newItem.next = current;
        }
        size++;
    }

    public void addLast(T item) {
        Item<T> current = last;
        Item<T> newItem = new Item<>(item, null);
        last = newItem;
        if (current == null) {
            first = newItem;
        } else {
            current.next = newItem;
        }
        size++;
    }

    public Item<T> first() {
        return first;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder buffer = new StringBuilder();
        buffer.append("[");

        Item<T> item = first;
        while(item.next != null) {
            buffer.append(item.object).append(',').append(' ');
            item = item.next;
        }
        buffer.append(item.object).append("]");

        return buffer.toString();
    }

    public class Item<T> {
        private final T object;
        private Item<T> next;

        public Item(T object, Item<T> next) {
            this.object = object;
            this.next = next;
        }

        public Item<T> getNext() {
            return next;
        }

        public T getObject() {
            return object;
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }
}
