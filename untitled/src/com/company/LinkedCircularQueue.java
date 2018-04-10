package com.company;

public class LinkedCircularQueue<E> implements CircularQueue<E> {

    private CircularLinkedList<E> circularLinkedList = new CircularLinkedList<>();


    @Override
    public void rotate() {
        circularLinkedList.rotate();
    }

    @Override
    public int size() {
        return circularLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return circularLinkedList.isEmpty();
    }

    @Override
    public E first() {
        return circularLinkedList.first();
    }

    @Override
    public E dequeue() {
        return circularLinkedList.removeFirst();
    }

    @Override
    public void enqueue(E e) {
        circularLinkedList.addLast(e);
    }

}
