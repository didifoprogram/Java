package com.dfmzone;

import java.util.ArrayList;
import java.util.Arrays;

public class Recur {

    private static int countTimes = 0;

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] b = {12, 20, 3, 4, 5};

        System.out.println(sumRecur(10));
        System.out.println(productRecur(5));
        System.out.println(arraySumRecur(b, 4));
        System.out.println(arrayProductRecur(a, 4));
        System.out.println(bs(a, 10, 0, 4));
        System.out.println(binarySum(a, 0, 7));
        System.out.println(ttt(5));
        permutation("abc", "");
        System.out.println( "S > "+"abc".charAt(2));
        System.out.println(unique3(new int[]{1, 2, 3, 4}, 0, 3));
        System.out.println(countTimes);
        System.out.println(Arrays.toString(fibonacciGood(10)));
        System.out.println("Maximum number > " + maxx(b, 4));
        System.out.println("Product recur2 " + productRecur2(3, 30));
        System.out.println(swappingLetters("Do [m<->s][t<->h][a<->a]you like sahtm? Ih'm full of forsulam wiht [ and ] and operahorm <->."));

    }


    private static int sumRecur(int n) {
        if (n == 0) return 0;

        return n + sumRecur(n - 1);
    }

    private static int productRecur(int n) {
        if (n == 0) return 1;

        return n * productRecur(n -1);
    }

    private static int arraySumRecur(int[] data, int n) {
        if (n == 0) return data[0];
        return data[n] + arraySumRecur(data, n - 1);
    }

    private static int arrayProductRecur(int[] data, int n) {
        if (n == 0) return data[0];

        return data[n] * arrayProductRecur(data, n - 1);
    }

    private static boolean bs(int[] data, int target, int low, int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (target == data[mid])
            return true;
        else if (target > data[mid])
            return bs(data, target, mid + 1, high);
        else
            return bs(data, target, low, mid -1);
    }

    private static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }

    // DEBUG TO SEE THE LIGHT
    private static int binarySum(int[] data, int low, int high) {
        if (low > high) return 0;

        if (low == high) {
            System.out.println("binarySum low " + low);
            return data[low];
        }
        else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
        }
    }

    private static int ttt(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return ttt(i - 1) + ttt(i - 2);
    }

    private static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0, i) + str.substring(i + 1);
            permutation(rem, prefix + str.charAt(i));
        }
    }

    private static boolean unique3(int[] data, int low, int high) {
        countTimes += 1;
        if (low >= high) return true;
        else if (!unique3(data, low, high-1)) return false;
        else if (!unique3(data, low + 1, high)) return false;
        else return (data[low] != data[high]);
    }


    private static long[] fibonacciGood(int n) {
        if (n <= 1) {
            long[] answer = {n, 0};
            return answer;
        } else {
            long[] temp = fibonacciGood(n - 1);
            long[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }
    }

    public static int maxx(int[] data, int n) {
        return maxx(data, n, 0);
    }

    private static int maxx(int[] data, int n, int target) {
        if (n < 1) return target;
        if (target < data[n]) {
            target = data[n];
        }
        return maxx(data, n - 1, target);
    }

    private static int productRecur2(int a, int b) {
        if (a == 0 || b == 0) return 0;
        if (a == 1) return b;
        return b + productRecur2(a - 1, b);
    }


    private ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> allSubSets;

        return null;
    }

    // "[a<->b]Bll your[b<->e] aesb erb [e<->a]eblong to us!"
    // "[m<->x][i<->y][s<->q][z<->p]Xyqqyqqyzzy"
    private static String swappingLetters(String text) {
        char[] a = text.toCharArray();
        char[] b = new char[2];
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] == ']') {
                b[0] = a[i - 1];
                b[1] = a[i - 5];

                for (int k = i; k < a.length; k++) {
                    if (Character.isUpperCase(a[k])){
                        if (a[k] == Character.toUpperCase(b[0])) a[k] = Character.toUpperCase(b[1]);
                        else if (a[k] == Character.toUpperCase(b[1])) a[k] = Character.toUpperCase(b[0]);
                    }
                    if (a[k] == b[0]) a[k] = b[1];
                    else if (a[k] == b[1]) a[k] = b[0];
                }
            }

        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '[' && a[i + 2] == '<') {
                i+= 6;
                continue;
            }
            s.append(a[i]);
        }
        return s.toString();
    }

}
