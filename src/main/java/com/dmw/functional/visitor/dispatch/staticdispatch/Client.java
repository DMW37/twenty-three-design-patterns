package com.dmw.functional.visitor.dispatch.staticdispatch;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Dog dog = new Dog();

        Execute exe = new Execute();
        exe.execute(a);
        exe.execute(a1);
        exe.execute(a2);
        exe.execute(dog);
    }
}