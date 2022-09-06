package com.dmw.creation.factory.factorymethod;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public class BCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }
}
