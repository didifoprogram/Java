package com.dfmzone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("Diego");
        linkedList.addFirst("Fernandes");
        linkedList.addLast("Mayoral");


        System.out.println(linkedList.size());
        System.out.println(linkedList.first());
        System.out.println(Arrays.toString(linkedList.last().getBytes()));
    }
}
