package com.dfmzone;

public class Guitar {

    private String serialNumber;
//    builder, type, backWood, topWood;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
