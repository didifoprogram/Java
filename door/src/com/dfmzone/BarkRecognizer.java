package com.dfmzone;


public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognizer(Bark bark) {
        System.out.println("Bark Recognizer heard a " + bark.getSound());
        for (Bark b : door.getBarkList()) {
            if (bark.equals(b)) {
                door.open();
                return;
            }
        }
    }
}


