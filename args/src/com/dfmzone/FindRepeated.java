package com.dfmzone;

import java.util.Arrays;
import java.util.Random;

public class FindRepeated {
    public static void main(String[] args) {

        int[] ar = {4, 3, 4, 3, 2};
        long startTime = System.nanoTime();
        findr2(ar);
        long endTime = System.nanoTime();

        long elapsed = endTime - startTime;
        System.out.println("Time: " + elapsed);
        //findr2(ar);
        //findr3(ar);
        int[][][] m = new int[2][2][2];
        int[][][] m2 = new int[2][2][2];
        m2[0][0][0] = 3;
        m2[1][0][0] = 3;
        m[0][0][0] = 1;
        m[1][0][0] =2;
        //dimen(m, m2);



    }

    public static void dimen(int[][][] a, int[][][] b) {
        int[][][] c = new int[a.length][a.length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                for (int k = 0; k < a.length; k++)
                    c[i][j][k] = a[i][j][k] + b[i][j][k];


        System.out.println(Arrays.deepToString(c));
    }

    // array n >= 2 with integers from 1 to n-1 O(n*n)
    public static void findr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }

    public static void findr2(int[] a) { // O(n)
        int[] count = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (count[a[i]] == 1) {
                System.out.println(a[i]);
            } count[a[i]]++;
        }
    }

    // IF you can modify the array O(n)
    public static void findr3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i])] > 0) {
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            } else {
                System.out.println(Math.abs(a[i]));
            }
        }
    }


}
