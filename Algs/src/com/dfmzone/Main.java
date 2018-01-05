package com.dfmzone;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        SinglyLinkedList<String> linkedList2 = new SinglyLinkedList<>();
        CircularlyLinkedList<String> circularlyLinkedList = new CircularlyLinkedList<>();
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        linkedList.addFirst("IBM");

        linkedList2.addFirst("AMD");

        System.out.println(linkedList.equals(linkedList2));


//        doublyLinkedList.addFirst("THREE");
//        doublyLinkedList.addFirst("TWO");
//        doublyLinkedList.addFirst("ONE");

//        System.out.println(doublyLinkedList.first());
//        circularlyLinkedList.addFirst("ONE");
//        circularlyLinkedList.addFirst("TWO");
//        circularlyLinkedList.addFirst("THREE");
//        circularlyLinkedList.addLast("FOUR");
//
//
//        for (int i = 0; i < circularlyLinkedList.size(); i++) {
//            System.out.println(circularlyLinkedList.first());
//            circularlyLinkedList.rotate();
//        }


//        linkedList.addFirst("ONE");
//        linkedList.addFirst("TWO");
//        linkedList.addFirst("THREE");
//        linkedList.removeFirst();
//        linkedList.addFirst("FOUR");
//
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.first());
//        System.out.println(linkedList.last());
    }
}
