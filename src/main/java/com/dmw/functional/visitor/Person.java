package com.dmw.functional.visitor;

/**
 * 创建抽象访问者接口
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}