package com.dfmzone;

public abstract class AbstractProgression<T> {

    T current;

    public AbstractProgression(T start) {
        current = start;
    }

    public T nextValue() {
        T answer = current;
        advance();
        return answer;
    }

    protected abstract void advance();

    public void printProgression(int n) {
        System.out.print(" " + nextValue());
        for (int i = 0; i < n; i++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
        System.out.println();
    }
}
