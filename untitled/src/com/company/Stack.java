package com.company;

public interface Stack<E> {

    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();
}
