package com.dfmzone;

public class Instrument {

    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;
    private InstrumentType instrumentType;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec, InstrumentType instrumentType) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", instrumentSpec=" + instrumentSpec +
                ", instrumentType=" + instrumentType +
                '}';
    }
}
