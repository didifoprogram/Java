package com.dfmzone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido starts barking");
        remote.pressButton();
        try {
            Thread.currentThread();
            Thread.sleep(10000);
        } catch (InterruptedException e) { }

        System.out.println("\nFido scratch the door");
        System.out.println("... so tod grabs the remote control");
        remote.pressButton();
        System.out.println("\nFido is back inside");

    }
}
