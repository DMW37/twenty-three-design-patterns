package com.dmw.functional.visitor;

/**
 * 定义抽象节点 -- 宠物
 */
public interface Animal {
    void accept(Person person);
}