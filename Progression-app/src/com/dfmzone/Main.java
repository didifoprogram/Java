package com.dfmzone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        AbstractProgression p = new ArithmeticProgression(4, 0);
//
//        p.printProgression(23);
//
//        AbstractProgression pm = new GeometricProgression();
//
//        pm.printProgression(20);
//
        AbstractProgression fp = new FibonacciProgression();

        fp.printProgression(5);

//        System.out.println(Arrays.toString(reverse(new Integer[]{1, 2, 3, 4, 5})));
//        fib(10);
//        AbstractProgression<Long> absoluteProgression = new AbsoluteProgression();
//        absoluteProgression.printProgression(20);
//        Horse d = new Equestrian();
//        System.out.println(((Horse) d).getClass().getCanonicalName());
//        AbstractProgression<Double> rootProgression = new SquareRootProgression();
//        rootProgression.printProgression(10);
//        System.out.println(Integer.valueOf("F", 16));
    }

    public static <T> T[] reverse(T[] data) {

        int low = 0, high = data.length - 1;

        while (low < high) {
            T tmp = data[low];
            data[low++] = data[high];
            data[high--] = tmp;
        }

        return data;
    }

    public static void fib(int n) {
        int current = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(current);
//            int tmp = prev;
            current += prev;
            prev = current - prev;

        }
    }
}
