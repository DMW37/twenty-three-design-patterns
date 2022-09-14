package com.dmw.functional.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义对象结构，此案例中就是主人的家
 */
public class Home {
    private List<Animal> nodeList = new ArrayList<Animal>();

    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    //添加操作
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}