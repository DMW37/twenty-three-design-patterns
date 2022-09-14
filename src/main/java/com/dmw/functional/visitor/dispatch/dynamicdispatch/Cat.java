package com.dmw.functional.visitor.dispatch.dynamicdispatch;

public class Cat extends Animal {
     @Override
    public void execute() {
        System.out.println("cat");
    }
}