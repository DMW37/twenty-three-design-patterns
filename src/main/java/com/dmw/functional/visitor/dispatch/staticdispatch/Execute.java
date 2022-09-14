package com.dmw.functional.visitor.dispatch.staticdispatch;

public class Execute {
    public void execute(Animal a) {
        System.out.println("Animal");
    }

    public void execute(Dog d) {
        System.out.println("dog");
    }

    public void execute(Cat c) {
        System.out.println("cat");
    }

    public void execute(com.dmw.functional.visitor.dispatch.doubledispatch.Animal animal) {

    }
}