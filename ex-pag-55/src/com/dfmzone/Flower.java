package com.dfmzone;

public class Flower {

    private String name;
    private int numOfPetals;
    private float price;

    public Flower(String name, int numOfPetals, float price) {
        this.name = name;
        this.numOfPetals = numOfPetals;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfPetals(int numOfPetals) {
        this.numOfPetals = numOfPetals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfPetals() {
        return this.numOfPetals;
    }

    public float getPrice() {
        return this.price;
    }
}
