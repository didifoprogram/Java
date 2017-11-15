package com.dfmzone;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[]{2, 2, 2, 1, 1};

//        for (int i : insertionSortNonIncreasing(arr)) {
//            System.out.print(i+", ");
//
//        }
//        System.out.println();

//        System.out.println(linearSearch(arr, 4));
//        System.out.println(checkEqualFrequency(arr));


//        System.out.println(charactersRearrangement("sadlkfjaslkjoiureoqiwuekdlaskjdlsakjdqweiqulkajdlkasjdlkjeoiuwqoeiquwdjeahfakjfhkqjwheoique",
//                "ijohjjkelaoqkaiuelqfjjwweekkqdelofwurikokdauhduouqasuejkidslkklqedjjsaawhfqdwdielqjsisjlkaa"));


        System.out.println(solveaSmall(4453, 4435211, 15433));
    }


    private static int[] insertionSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1; //index that we are comparing
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
        return a;
    }

    private static int[] insertionSortNonIncreasing(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i =  j - 1;
            while (i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }

        return a;
    }

    private static Integer linearSearch(int[] a, int v) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] == v) {
                return j;
            }
        }
        return null;
    }

    // inputArray: [2, 2, 2, 1, 1] = false
    private static boolean checkEqualFrequency(int[] a) {
        int c = 0;
        Set s = new HashSet();
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                c++;
            } else {
                s.add(c);
                c = 0;
            }
        }
        s.add(c);

        return s.size() == 1;
    }

    private static boolean charactersRearrangement(String s1, String s2) {
//        String s3 = s1 + s2;
//        char[] c = s3.toCharArray();
//        Set s = new HashSet();
//        for (char d:c) {
//            s.add(d);
//        }
//        for (int i = 0; i < s3.length(); i++) {
//            s.add(s3.charAt(i));
//        }
//        return s.size() == s1.length();

        String sorted =
                Stream.of(s1.split(""))
                        .sorted()
                        .collect(Collectors.joining());


        System.out.println(sorted);
        return false;
//        char[] a = s1.toCharArray();
//        char[] b = s2.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        return Arrays.equals(a, b);
    }

    private static int solveaSmall(int a, int n, int p) {

        BigInteger q = new BigInteger(String.valueOf(a));
        BigInteger e = new BigInteger(String.valueOf(p));

        int f = 1;
        for (int i = 0; i <n;i++) {
            f *= i;

        }
        BigInteger w = new BigInteger(String.valueOf(f));
        return q.modPow(w,e).intValue();

    }


}

