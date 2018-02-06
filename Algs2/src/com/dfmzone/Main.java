package com.dfmzone;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addLast(10);
        list.addLast(5);
        list.addLast(1);


        try {
            SinglyLinkedList<Integer> list1 = list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
