package com.dmw.creation.builder;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public class OffBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮宝座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
