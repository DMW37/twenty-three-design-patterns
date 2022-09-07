package com.dmw.structural.decorator;

public class Bird extends Change {
    public Bird(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        System.out.println("bird move");
    }
}
