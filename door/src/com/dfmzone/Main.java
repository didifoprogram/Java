package com.dfmzone;

public class Main {

    public static void main(String[] args) {

        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);
        BarkRecognizer barkRecognizer = new BarkRecognizer(dogDoor);
        dogDoor.setTime(3000);
        dogDoor.addAllowedBark(new Bark("Woof"));
        dogDoor.addAllowedBark(new Bark("Auu"));

        System.out.println("Dog starts barking");
        barkRecognizer.recognizer(new Bark("Woof"));
//        remote.pressButton();
        try {
            Thread.currentThread();
            Thread.sleep(6000);
        } catch (InterruptedException e) { }

        System.out.println("\nDog starts barking");
        barkRecognizer.recognizer(new Bark("Woof"));
//        System.out.println("... so tod grabs the remote control");
//        remote.pressButton();
        System.out.println("\nDog is back inside");

    }
}
