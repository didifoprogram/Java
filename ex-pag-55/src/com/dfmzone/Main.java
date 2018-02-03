package com.dfmzone;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        inputAllBaseTypes();
//        System.out.println(Funcs.isMultiple(16,8));
//        System.out.println(10 << 2);
//        System.out.println(10 >>> 1);
//        System.out.println(13 >>> 3);
//        System.out.println(-10 >> 1);
//
//        System.out.println(Funcs.isEven(11));
//        System.out.println(Funcs.sumInts(5));
//        System.out.println(Funcs.sumIntsOdd(15));
//        System.out.println(Funcs.sumPower(4));
//        System.out.println("HOW MANY VOWELS > " + Funcs.howManyVowels("diego"));
//        System.out.println("REMOVE PUNCTUATION > " + Funcs.removePunctuation("Let’s try, Mike!"));
//
//        System.out.println(Arrays.toString(Funcs.invertArray(new int[]{2, 3, 6, 45, 65})));
//
//        System.out.println(Arrays.toString(Funcs.minMax(new int[]{3, 1, 34, 4, 2, -12})));
//
//        Funcs.aritFormula(10, 2, 4);
//        System.out.println(Funcs.productEven(new int[]{111,5,11,1,3}));
//
//        System.out.println("NORM = " + Funcs.norm(new double[] {4, 3}));
//        System.out.println("NORM2 = " + Funcs.norm(3, new double[] {4,3}));
//
//        System.out.println(Funcs.divideTimes(24));
//        float[] floats = {3.13f, 4.43f, 5.444f, 3.73f};
//        System.out.println(Funcs.compareFloat(floats));
//        System.out.println(Funcs.allDifferent(floats));
//        System.out.println(Arrays.toString(Funcs.arrayProduct(new int[]{2, 3, 6}, new int[]{5, 7, 1})));
//        Funcs.reverseLines();
//        Funcs.schoolPunishment();
//        System.out.println(Funcs.sameBirthday(70));




    }


    public static void inputAllBaseTypes() {

        System.out.println("Enter a string");
        String string = scanner.nextLine();

        System.out.println("Enter a integer");
        int number = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter a boolean");
        boolean bool = scanner.nextBoolean();

        scanner.nextLine();

        System.out.println("Enter a double");
        double doub = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter a float");
        float f = scanner.nextFloat();


        Object[] objects = new Object[5];

        objects[0] = string;
        objects[1] = number;
        objects[2] =bool;
        objects[3] = doub;
        objects[4] = f;

        for (Object o : objects) {
            System.out.println(o.getClass().getCanonicalName());
        }
    }


}
