package com.dfmzone;

public class C318 {

    public static void main(String[] args) {

        int[] a = {1, 1, 1, 1, 1, 2, 3, 2, 4};
        //findr(a);
        System.out.println(2 ^ 1);
    }

    // size n >= 6 with int from 1 to n -5
    public static void findr(int[] ar) {
        int[] c = new int[ar.length];
        for (int i =0; i < ar.length; i++) {
            if (c[ar[i]] == 4) {
                System.out.println(ar[i]);
            } else {
                c[ar[i]]++;
            }
        }
    }


}
