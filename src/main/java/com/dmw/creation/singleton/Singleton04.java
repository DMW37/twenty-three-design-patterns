package com.dmw.creation.singleton;


import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 懒汉式：1
 */
public class Singleton04 implements Serializable {

    private static final long serialVersionUID = 2324160538947095084L;
    private static Singleton04 singleton04;

    private Singleton04() {

    }

    public static Singleton04 getInstance() {
        if (singleton04 != null) {
            // 线程不安全
            singleton04 = new Singleton04();
        }
        return singleton04;
    }
}
