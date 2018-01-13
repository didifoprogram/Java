package com.dfmzone;

import java.util.Random;

public class Pag145 {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 2, 3, 4};
        removeEntryUntilEmpty(a);

    }

    public static void removeEntryUntilEmpty(int[] arr) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int removedEntries = 0;
        int curr;

        while (removedEntries < arr.length) {
            curr = random.nextInt(arr.length);
            if (arr[curr] != 0) {
                arr[curr] = 0;
                removedEntries++;
                System.out.println("Removed index > " + curr);
            }
        }
    }
}
