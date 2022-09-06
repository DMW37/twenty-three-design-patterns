package com.dmw.creation.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 懒汉式：3
 */
public class Singleton06 implements Serializable {
    @Serial
    private static final long serialVersionUID = -1706797323695311123L;
    private static Singleton06 singleton06;

    private Singleton06() {

    }

    public static Singleton06 getInstance() {
        if (singleton06 == null) {
            // 线程不安全
            synchronized (Singleton06.class) {
                singleton06 = new Singleton06();
            }
        }
        return singleton06;
    }

}
