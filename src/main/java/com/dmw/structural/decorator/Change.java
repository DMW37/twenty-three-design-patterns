package com.dmw.structural.decorator;

/**
 * 抽象装饰角色
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage theGreatestSage;

    public Change(TheGreatestSage theGreatestSage) {
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public void move() {
        this.theGreatestSage.move();
    }
}
