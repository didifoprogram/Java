package com.dfmzone;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {
        int data[] =  new int[10];
        Random random = new Random();

        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }
        int[] orig = Arrays.copyOf(data, data.length);
        System.out.println("Arrays equal before sort: " + Arrays.equals(data, orig));
        Arrays.sort(data);
        System.out.println("Arrays equals after sort: " + Arrays.equals(data, orig));

        System.out.println("orig " + Arrays.toString(orig));
        System.out.println("data " + Arrays.toString(data));

        // Linear num generator
        int cur = 92;
        for (int k = 0; k < 25; k++) {
            cur = (12 * cur + 5) % 100;
            System.out.println(cur);
        }
        System.out.println();
        System.out.println(0x30);
    }
}
