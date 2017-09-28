package com.dfmzone;

public class DogDoor {

    private Boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("Opening the door");
        this.open = true;
    }

    public void close() {
        System.out.println("Closing the door");
        this.open = false;
    }

    public Boolean isOpen() {
        return open;
    }
}
