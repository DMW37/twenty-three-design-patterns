package com.dmw.creation.factory.abstractfactory;

/**
 * 产品一族的工厂
 * 特定的工厂，生产不同的产品
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
