package com.dmw.functional.visitor;

/**
 * 创建不同的具体访问者角色（主人和其他人），都需要实现 `Person`接口
 */
public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}