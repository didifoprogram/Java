package com.dfmzone;

public class CircularlyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

    } // ----------- end of nested Node class ----------- //

    public Node<E> tail = null;
    private int size = 0;
    public CircularlyLinkedList() {}

    public int size() { return size; }
    public boolean isEmpty() { return size == 0;}
    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty())  return null;
        return tail.getElement();
    }

    public void rotate() {
        if (tail !=null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            tail.setNext(new Node<>(e, tail.getNext()));
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> answer = tail.getNext();
        if (answer == tail) tail = null;
        else tail.setNext(answer.getNext());
        return answer.getElement();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        CircularlyLinkedList other = (CircularlyLinkedList) o;
        Node walkA = tail;
        Node walkB = other.tail;
        while (walkA != null) {
            if (!walkA.getElement().equals(walkB.getElement())) return false;
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }
}
