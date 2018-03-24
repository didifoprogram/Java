package com.dfmzone;

import java.io.File;

public class CalculateDiskUsage {
    public static void main(String[] args) {

        diskUsage(new File("/home/diego/Downloads/haskell"));
    }

    public static long diskUsage(File root) {
        long total = root.length();
        if (root.isDirectory()) {
            for (String childName : root.list()) {
                File child = new File(root, childName);
                total += diskUsage(child);
            }
        }
        System.out.println(total + "\t" + root);
        return total;
    }
}
