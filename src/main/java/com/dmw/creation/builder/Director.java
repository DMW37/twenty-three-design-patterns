package com.dmw.creation.builder;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike build() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
