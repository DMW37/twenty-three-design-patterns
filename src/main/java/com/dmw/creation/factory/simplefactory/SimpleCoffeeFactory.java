package com.dmw.creation.factory.simplefactory;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 简单工厂
 */
public class SimpleCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee(String type) {
        if (CoffeeFactory.COFFEE_TYPE_A.equals(type)){
            return new ACoffee();
        }else if (CoffeeFactory.COFFEE_TYPE_B.equals(type)){
            return new BCoffee();
        }
        return null;
    }
}
