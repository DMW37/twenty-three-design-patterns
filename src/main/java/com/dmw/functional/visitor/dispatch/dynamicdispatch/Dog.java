package com.dmw.functional.visitor.dispatch.dynamicdispatch;

public class Dog extends Animal {
    @Override
    public void execute() {
        System.out.println("dog");
    }
}