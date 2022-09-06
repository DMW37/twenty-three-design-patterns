package com.dmw.creation.builder;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 建造者模式，对建造细节进行封装，如果对象构建复杂，这会是一个好选择
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new OffBikeBuilder());
        Bike build = director.build();
        System.out.println(build.getFrame());
        System.out.println(build.getSeat());
    }
}
