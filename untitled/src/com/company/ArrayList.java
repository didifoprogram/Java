package com.company;

public class ArrayList<E> implements List<E> {

    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;

    //constructors
    public ArrayList() { this(CAPACITY);}

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    protected void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int k=0; k<size; k++)
            temp[k] = data[k];
        data = temp;
    }

    //public methods
    public int size() { return size;}
    public boolean isEmpty() {return size == 0;}
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        return data[i];
    }

    // Replace element and return the replaced.
    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E temp = data[i];
        data[i] = e;
        return temp;
    }

    // Inserts element e in the index i, shifting all subsequent elements later.
    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
        checkIndex(i, size + 1);
        if (size == data.length)
            resize(size*2);
        if (size == data.length)
            throw new IllegalStateException("Array is full");
        for (int k = size-1; k >= i; k--)
            data[k+1] = data[k];
        data[i] = e;
        size++;
    }

    // Remove element at index i and shift
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E temp = data[i];
        for (int k = i; k < size-1;k++)
            data[k] = data[k+1];
        data[size-1] = null;
        size--;
        return temp;
    }

    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
        if (i<0 || i >=n)
            throw new IndexOutOfBoundsException("Illegal index: " + i);
    }

}
