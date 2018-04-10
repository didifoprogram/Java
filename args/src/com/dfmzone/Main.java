package com.dfmzone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        repeat2('a', 500000);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
dd
        double[] arr = {10, 15, 20, 25, 35};
        int[] arr2 = {1, 2, 10, 40, 20, 12, 55};
        System.out.println(Arrays.toString(prefixAverage2(arr)));
        System.out.println(power(2, 3));


        reverseArray(arr2, 0, 6);
        power(2.0, 8);

        System.out.println(binaySum(arr2, 0, 6));
        permutation("abcd");
        System.out.println(linearSum(arr2, 7));


        int[] cur = {1, 2, 3, 4, 5};

        System.out.println("TE >>>>    " + recur3(4));
        System.out.println("N Power " + nPower(2.0, 8));

        System.out.println(largest(3));
    }

    public static String repeat1(char c, int n) {
        String answer = "";
        for (int i = 0; i <n; i++) {
            answer += c;
        }
        return answer;
    }

    public static String repeat2(char c, int n) {
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i< n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static double[] prefixAverage1(double[] x) { // O(n^2)
        int n = x.length;
        double[] a = new double[n];
        for (int j = 0; j < n; j++) {
            double total = 0;
            for (int i = 0; i <= j; i++) {
                total += x[i];
            }
            a[j] = total / (j + 1);
        }
        return a;
    }

    public static double[] prefixAverage2(double[] x) { // O(n)
        int n = x.length;
        double[] a = new double[n];
        double total = 0;
        for (int j = 0; j < n; j++) {
            total += x[j];
            a[j] = total / (j + 1);
        }
        return a;
    }

    private static int power(int a, int b) {
        if (b < 0) {
            return 0; // err
        }
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, (b - 1));
        }
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException();
        else if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static int linearSum(int[] data, int n) {
        if (n == 0)
            return 0;
        else
            return linearSum(data, n - 1) + data[n - 1];
    }

    public static void reverseArray(int[] a, int low, int high) {
        if (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            reverseArray(a, low + 1, high - 1);
        }
        System.out.println(Arrays.toString(a));
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            double partial = power(x, n/2);
            double result = partial * partial;
            if (n % 2 == 1)
                result *= x;
            return result;
        }
    }

    private static double nPower(double x, int n) {
        if (n == 0) return 1;
        int co = 1;
        double result = 1;
        while (co <= n) {
            result = result * result;
            if (co % 2 == 1)
                result *= x;
            co *= 2;
        }
        return result;
    }

    public static int binaySum(int[] dta, int low, int high) {
        if (low > high) return 0;
        if (low == high)
            return dta[low];
        else {
            int mid = (low + high) / 2;
            return binaySum(dta, low, mid) + binaySum(dta, mid+1,high);
        }
    }

    public static void permutation(String str) {
        permutation(str, "");
    }
    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static int recur(int[] data, int n) {
        if (n == 0) return 0;

        return data[n - 1] + recur(data, n -1);
    }

    public static int recur2(int[] data, int n) {
        if (n == 0) return 1;

        return data[n - 1] * recur2(data, n - 1);
    }

    public static int recur3(int n) {
        if (n == 0) return 0;

        return n + recur3(n -1);
    }

    static int largest(int n) {
        Double d = Math.pow(9.999999999, n);
        return d.intValue();
    }



}
