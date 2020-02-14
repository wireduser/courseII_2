package com.education_wired_.work223;

import java.util.Random;

public class ID {

    private int id;

    private static int nextId;

    static {
        // nextId = (int)(Math.random()*100);
        // або
        Random random = new Random();
        nextId = random.nextInt(100) + 1;
    }

    {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ID() {

    }
    public ID(int id) {

    }

}
