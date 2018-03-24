package com.dfmzone;

public class InsertionSort {

    // ['a' 'f' 'e' 'd']
    public void insertion(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            char cur = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > cur) {
                data[j - 1] = data[j];
                j--;
            }
            data[j] = cur; // optimize
        }
    }

}
