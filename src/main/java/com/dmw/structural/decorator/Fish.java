package com.dmw.structural.decorator;

/**
 * 具体装饰角色
 */
public class Fish extends Change{
    public Fish(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        System.out.println("fish move");
    }

    public void swim(){
        System.out.println("fish swim");
    }
}
