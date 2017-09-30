package com.dfmzone;

import java.util.*;

public class DogDoor {

    private Boolean open;
    private int time;
    private List<Bark> barkList = new ArrayList<>();


    public DogDoor() {
        this.open = false;
    }

    public void addAllowedBark(Bark bark) {
        barkList.add(bark);
    }

    public List<Bark> getBarkList() {
        return this.barkList;
    }

    public void open() {
        System.out.println("Opening the door");
        this.open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, time);
    }

    public void close() {
        System.out.println("Closing the door");
        this.open = false;
    }

    public Boolean isOpen() {
        return open;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
