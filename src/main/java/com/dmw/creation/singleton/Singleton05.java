package com.dmw.creation.singleton;

import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 饿汉式：2
 */
public class Singleton05 implements Serializable {

    private static final long serialVersionUID = 1153448522395870965L;
    private static Singleton05 singleton05;

    private Singleton05() {

    }

    /**
     * 线程安全，但是效率低
     * @return
     */
    public static synchronized Singleton05 getInstance() {
        if (singleton05 != null) {
            singleton05 = new Singleton05();
        }
        return singleton05;
    }
}
