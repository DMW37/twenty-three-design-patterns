package com.dmw.structural.decorator;

public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        sage.move();
        // 单层装饰
        Bird bird = new Bird(sage);
        bird.move();
        Fish f = new Fish(bird);
        f.move();
        f.swim();
    }
}
