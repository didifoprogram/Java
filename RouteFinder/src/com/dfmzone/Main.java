package com.dfmzone;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException {

//        SubwayLoader subwayLoader = new SubwayLoader();
//        Subway subway = subwayLoader.loadFromFile(new File("/home/diego/IdeaProjects/Java/RouteFinder/src/com/dfmzone/loader/ObjectvilleSubway.txt"));

//        subway.getStations().forEach(s -> System.out.println(s.getName()));

//        subway.getConnections().forEach(c -> System.out.println(c.getStation1().getName() + " < - > " + c.getStation2().getName()));

        int[] test = new int[]{1, 2, 3, 4, 5, 3, 5, 6};

        System.out.println(almostIncreasingSequence(test));
    }

    private static boolean almostIncreasingSequence(int[] sequence) {
        int c = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                c++;
            }
            if (c > 1) return false;
        }
        return true;
    }
}