package com.company;

public interface Deque<E> {

    int size();
    boolean isEmpty();
    E firt();
    E last();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
}

