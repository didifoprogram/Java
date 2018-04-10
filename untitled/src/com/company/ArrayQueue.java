package com.company;
// 0 | 1 | 2 | 3 | 4 | 5 |
public class ArrayQueue<E> implements Queue<E> {

    private static final int CAPACITY = 1000;
    private E[] data;
    private int f = 0; // index of the front element
    private int sz = 0; // current number os elements

    // Constructors
    public ArrayQueue() {this(CAPACITY);}
    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    // methods
    public int size() { return sz;}

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }

    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    public E dequeue() {
        if (isEmpty()) return null;
        E answer = data[f];
        data[f] = null;
        f = (f+1) % data.length;
        sz--;
        return answer;
    }
}
