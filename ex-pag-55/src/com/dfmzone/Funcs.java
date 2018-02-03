package com.dfmzone;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funcs {

    public static boolean isMultiple(long n, long m) {
        for (long j = 1; j < n; j++) {
            if (m * j == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEven(int i) {
        // can't use * % /
        return (i & 1) == 0; // if i=10 then 1010
//                                           0001
//                                         = 0000
    }

    public static int sumInts(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumIntsOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if ((i & 1) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumPower(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static int howManyVowels(String word) {
        return word.length() - word.split("[aeiou]+").length;
    }

    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[^a-zA-Z ]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            m.appendReplacement(sb, "");
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /*
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * */

    public static int[] invertArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 1; i <= a.length; i++) {
            b[i - 1] = a[a.length - i];
        }
        return b;
    }

    public static int[] minMax(int[] n) {
        int min = 1;
        int max = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
            if (n[i] > max) {
                max = n[i];
            }
        }
        return new int[]{min, max};
    }

    public static void aritFormula(int a, int b, int c) {
        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);

        } else if (a - b == c) {
            System.out.println(a + " - " + b + " = " + c);

        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);

        } else if (a / b == c) {
            System.out.println(a + " / " + b + " = " + c);

        } else {
            System.out.println("No combination found");
        }
    }

    public static String productEven(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (((a[index] * a[i] & 1) == 0) && i != index) {
                return "Found even product >> " + a[index] + " * " + a[i] + " = " + (a[index] * a[i]);
            }
        }
        return "No even product found";
    }

    public static double norm(double p, double[] v) {
        double t = 0;
        for (double i :
                v) {
            t += Math.pow(i, p);
        }
        return Math.sqrt(t);
    }

    // p-norm  Euclidean vector norm
    public static double norm(double[] v) {
        double t = 0;
        for (double i :
                v) {
            t += Math.pow(i, 2);
        }

        return Math.sqrt(t);
    }

    public static int divideTimes(int n) {
        int count = 0;

        while (n >= 2) {
            n = n >>> 1;
            count++;
        }
        return count;
    }

    public static boolean compareFloat(float[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[j] == n[i] && j != i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean allDifferent(float[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[j] == n[i] && j != i) {
                    return false;
                }
            }
        }
        return true;
    }

    //1.23
    public static int[] arrayProduct(int[] a, int[] b) {
        if (a.length != b.length) {
            System.out.println("Array a and b must be  the same size");
            return null;
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
        return c;
    }

    public static void reverseLines() {
        Scanner scanner = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        int option = 1;

        while (option == 1) {
            a.add(scanner.nextLine());

            System.out.println("Press 0 to quit or 1 to continue writing");
            option = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = a.size() - 1; i >= 0; i--) {
            System.out.println(a.get(i));
        }
    }


    //1.28
    public static void schoolPunishment() {
        String s = "I will never spam my friend again";

        Random random = new Random();
        for (int i = 0; i < 101; i++) {
            if (i % 8 == 0){
                String ns = s.replace(s.charAt(random.nextInt(s.length())), s.charAt(random.nextInt(s.length()) / 2));
                System.out.println(ns);
            }
            System.out.println(s);
        }
    }

    public static BigDecimal sameBirthday(int n) {
        BigDecimal b = new BigDecimal((364.0/365.0));
        BigDecimal i = new BigDecimal(1);
        return (b.pow((n*(n-1)/2)).setScale(4, RoundingMode.HALF_UP).subtract(i).negate());

    }







}

