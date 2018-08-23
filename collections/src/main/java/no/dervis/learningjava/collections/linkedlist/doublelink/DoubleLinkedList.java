package no.dervis.learningjava.collections.linkedlist.doublelink;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T> {
    protected int size;
    protected DoubleLinkedItem<T> first;
    protected DoubleLinkedItem<T> last;

    public void addFirst(T item) {
        DoubleLinkedItem<T> current = first;
        DoubleLinkedItem<T> newItem = new DoubleLinkedItem<>(null, item, null);
        first = newItem;
        if (current == null) {
            last = newItem;
        } else {
            newItem.next = current;
            current.previous = newItem;
        }
        size++;
    }

    public void addBefore(int beforeIndex, T item) {
        if (beforeIndex < 0 || beforeIndex > size) throw new IndexOutOfBoundsException();

        if (beforeIndex == 0) {
            addFirst(item);
        } else {
            DoubleLinkedItem<T> pointer = getPointerAtIndex(beforeIndex);
            addBefore(item, pointer);
        }
    }

    public void addBefore(T beforeItem, T item) {
        DoubleLinkedItem<T> pointer = first;
        boolean stop = false;

        for (int i = 0; i < size && !stop; i++) {
            if (pointer.data == beforeItem || pointer.data.equals(beforeItem)) {
                addBefore(item, pointer);
                stop = true;
            }
            pointer = pointer.next;
        }
    }

    private void addBefore(T item, DoubleLinkedItem<T> before) {
        DoubleLinkedItem<T> oldPrevious = before.previous;
        DoubleLinkedItem<T> newItem = new DoubleLinkedItem<>(oldPrevious, item, before);
        before.previous = newItem;

        if (oldPrevious == null) {
            first = newItem;
        } else {
            oldPrevious.next = newItem;
        }
        size++;
    }

    public void addAfter(int afterIndex, T item) {
        if (afterIndex < 0 || afterIndex > size) throw new IndexOutOfBoundsException();

        if (afterIndex == size) {
            addLast(item);
        } else {
            DoubleLinkedItem<T> pointer = getPointerAtIndex(afterIndex);
            addAfter(item, pointer);
        }
    }

    private DoubleLinkedItem<T> getPointerAtIndex(int index) {
        DoubleLinkedItem<T> pointer = first;
        for (int i = 0; i < index && pointer.next != null; i++) {
            pointer = pointer.next;
        }
        return pointer;
    }

    public void addAfter(T afterItem, T item) {
        DoubleLinkedItem<T> pointer = first;
        boolean stop = false;

        for (int i = 0; i < size && !stop; i++) {
            if (pointer.data == afterItem || pointer.data.equals(afterItem)) {
                addAfter(item, pointer);
                stop = true;
            }
            pointer = pointer.next;
        }
    }

    private void addAfter(T item, DoubleLinkedItem<T> after) {
        DoubleLinkedItem<T> oldNext = after.next;
        DoubleLinkedItem<T> newItem = new DoubleLinkedItem<>(after, item, oldNext);
        after.next = newItem;

        if (oldNext == null) {
            last = newItem;
        } else {
            oldNext.previous = newItem;
        }
        size++;
    }

    public void addLast(T item) {
        DoubleLinkedItem<T> current = last;
        DoubleLinkedItem<T> newItem = new DoubleLinkedItem<>(null, item, null);
        last = newItem;
        if (current == null) {
            first = newItem;
        } else {
            current.next = newItem;
            newItem.previous = current;
        }
        size++;
    }

    public DoubleLinkedItem<T> first() {
        return first;
    }

    public DoubleLinkedItem<T> last() {
        return last;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder buffer = new StringBuilder();
        buffer.append("[");

        DoubleLinkedItem<T> item = first;
        while(item.next != null) {
            buffer.append(item.data).append(',').append(' ');
            item = item.next;
        }
        buffer.append(item.data).append("]");

        return buffer.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkedListIterator<>(this);
    }

    public static class DoubleLinkedItem<I> {
        private I data;
        private DoubleLinkedItem<I> next;
        private DoubleLinkedItem<I> previous;

        public DoubleLinkedItem(DoubleLinkedItem<I> previous, I data, DoubleLinkedItem<I> next) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public DoubleLinkedItem<I> next() {
            return next;
        }

        public DoubleLinkedItem<I> previous() {
            return previous;
        }

        public I data() {
            return data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
