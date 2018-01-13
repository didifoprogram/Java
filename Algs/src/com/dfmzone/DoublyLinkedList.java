package com.dfmzone;

public class DoublyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setNext(Node<E> n) {
            this.next = n;
        }

        public void setPrev(Node<E> p) {
            this.prev = p;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

//    public int size() {
//        return size;
//    }

    public int size() {
        int s = 0;
        Node<E> h = header;
        while (header.getNext() != trailer) {
            s++;
            header = header.getNext();
        }
        header = h;
        return s;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }

    /* Private methods*/
    // Add an element between the predecessor and the successor
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    // Removes the given node from the list and return it;
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
}
