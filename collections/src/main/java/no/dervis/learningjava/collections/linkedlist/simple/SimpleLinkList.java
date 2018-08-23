package no.dervis.learningjava.collections.linkedlist.simple;

/**
 * A simple implementation of a LinkedList.
 *
 * @author Dervis M
 */

public class SimpleLinkList {

    private int size;
    private Node first;
    private Node last;

    public void addFirst(Object item) {
        Node current = first;
        Node newNode = new Node(item, null);
        first = newNode;
        if (current == null) {
            last = newNode;
        } else {
            newNode.next = current;
        }
        size++;
    }

    public void addLast(Object item) {
        Node current = last;
        Node newNode = new Node(item, null);
        last = newNode;
        if (current == null) {
            first = newNode;
        } else {
            current.next = newNode;
        }
        size++;
    }

    /**
     * Removes the first occurrence of 'item'
     */
    public void remove(Object item) {
        Node currentNode = first;
        Node previousNode = null;

        if (first == null) return;

        if (first.object.equals(item)) {
            first = first.next;
            return;
        }

        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;

            if (currentNode.object.equals(item)) {
                previousNode.next = currentNode.next;
                return;
            }
        }
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder buffer = new StringBuilder();
        buffer.append("[");

        Node node = first;
        while(node.next != null) {
            buffer.append(node.object).append(',').append(' ');
            node = node.next;
        }
        buffer.append(node.object).append("]");

        return buffer.toString();
    }

    private class Node {
        private Object object;
        private Node next;

        public Node(Object object, Node next) {
            this.object = object;
            this.next = next;
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }
}
