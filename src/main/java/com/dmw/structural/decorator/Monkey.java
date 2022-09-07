package com.dmw.structural.decorator;

/**
 * 具体的构建者
 */
public class Monkey implements TheGreatestSage {
    @Override
    public void move() {
        System.out.println("monkey move");
    }
}
