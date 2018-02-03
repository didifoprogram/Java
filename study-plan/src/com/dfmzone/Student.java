package com.dfmzone;

public class Student {

    private static int numOfInstances;
    private String name;
    private int age;

    Student() {
        this("Diego", 24);
        numOfInstances++;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getNumOfInstances() {
        return numOfInstances;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
