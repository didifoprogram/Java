package com.dfmzone;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {

        int[] data = new int[10];
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }

        int[] orig = Arrays.copyOf(data, data.length);
        System.out.println("Before sorting " + Arrays.toString(data));
        Arrays.sort(data);
        System.out.println("After sorting " + Arrays.toString(data));

        System.out.println();
        System.out.println("orig " + Arrays.toString(orig));
        System.out.println("data " + Arrays.toString(data));

        // Linear number generator
        int cur = 92;
        for (int k = 0; k < 25; k++) {
            cur = (12 * cur + 5) % 100;
            System.out.println(cur);
        }
        System.out.println();
        System.out.println(0xFF); // 15 x 16^1 + 15 x 16^0
    }
}
