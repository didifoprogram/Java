package com.dfmzone;

public class SinglyLinkedList<E> implements Cloneable {

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

    private Node<E> head = null;
    private Node<E> tail = null;
    private static int size = 0;

    public SinglyLinkedList() {

    }

    // access methods
    public static int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // Return but does not remove the first element
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void printAll() throws NullPointerException {
        while (head.element != null) {
            System.out.println(head.element);
            head = head.getNext();
        }
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public void rotate() {

    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    public E secondToLast() {
        Node<E> walk = head;
        while (true) {
            if (walk.getNext().getNext() == null) {
                return walk.getElement();
            } else walk = walk.getNext();
        }
    }

    // Equals method implementation
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SinglyLinkedList other = (SinglyLinkedList) o;
        if (size != other.size) return false;
        Node walkA = head;
        Node walkB = other.head;
        while (walkA != null) {
            if (!walkA.getElement().equals(walkB.getElement())) return false;
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }

    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        // Always use inherited Object.clone() to create the initial copy
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); //safe cast
        if (size > 0) { // we need independent chain of nodes
            other.head = new Node<>(head.getElement(), null);
            Node<E> walk = head.getNext(); // walk through remainder of original list
            Node<E> otherTail = other.head; // remember most recently created node
            while (walk != null) {
                Node<E> newest = new Node<>(walk.getElement(), null);
                otherTail.setNext(newest);
                otherTail = newest;
                walk = walk.getNext();
            }
        }
        return other;
    }


}
