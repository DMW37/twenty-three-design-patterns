package com.dmw.functional.visitor;

/**
 * 定义实现`Animal`接口的 具体节点（元素）
 */
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }
}