package com.dfmzone;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<Integer> q = new ConcurrentLinkedDeque<>();

        q.add(3);
        q.add(2);
        q.add(3);
        q.add(1);

        System.out.println(q.element().intValue());
        System.out.println(q.element().intValue());


        double a = 6.00e22;

        System.out.println(a);
        Student b = new Student();

        System.out.println(b.getNumOfInstances());

        Student c = new Student();

        System.out.println(c.getAge());


        int[] numbers = new int[10];

        numbers[5] = 10;
        numbers[6] = 2;
        int j = 5;
        numbers[j++] = numbers[j++] + 2;
        System.out.println(numbers[6]);

        int i2 = 10;
        String a2 = Integer.toString(i2);

        Day.message(Day.SEGUNDA);


        System.out.println("Enter a number: ");
        int numberScan = scanner.nextInt();

        System.out.println("Enter a string");
        scanner.nextLine();
        String stringScan = scanner.nextLine();


        System.out.println(numberScan + " " + stringScan);


    }
}
