package com.dmw.creation.builder;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
