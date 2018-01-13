package com.dfmzone;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        insertionSort2(new char[]{'a', 'f', 'e', 'c', 'w'});
    }

//    public static void insertionSort(char[] data) {
//        int n = data.length;
//        for (int k = 1; k < n; k++) {
//            char curr = data[k];
//            int j = k;
//            while (j > 0 && data[j - 1] > curr) {
//                data[j] = data[j - 1];
//                j--; // IMPORTANT
//            }
//            data[j] = curr;
//        }
//        System.out.println(Arrays.toString(data));
//    }

    // ['a', 'f', 'c', 'h', 'e']
    private static void insertionSort2(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            char curr = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > curr) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = curr;
        }
        System.out.println(Arrays.toString(data));
    }
}