package com.dfmzone;

public class BinarySearch {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 6, 10, 12, 20, 40, 45, 50};

        System.out.println(binarySearch(a, 1, 0, 9));
        System.out.println("aaacf".replace("ac", "b"));
    }

    // O(log n)
    public static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low > high) return false;
        else {
            int mid = (low + high) / 2;
            if (target == data[mid]) return true;
            else if (target < data[mid])
                return binarySearch(data, target, low, mid - 1);
            else
                return binarySearch(data, target, mid + 1, high);
        }
    }
}
