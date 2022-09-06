package com.dmw.creation.factory.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        factory.createFood().printName();
        factory.createVehicle().go();
    }

}