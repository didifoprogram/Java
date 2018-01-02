package com.dfmzone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("ONE");
        linkedList.addFirst("TWO");
        linkedList.addLast("THREE");


        System.out.println(linkedList.size());
        System.out.println(linkedList.first());
        System.out.println(Arrays.toString(linkedList.last().getBytes()));
    }
}
