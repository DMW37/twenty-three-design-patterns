package com.dmw.creation.factory.simplefactory;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public interface CoffeeFactory {
    String COFFEE_TYPE_A = "ACoffee";
    String COFFEE_TYPE_B = "BCoffee";
    Coffee createCoffee(String type);
}
