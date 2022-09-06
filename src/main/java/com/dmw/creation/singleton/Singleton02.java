package com.dmw.creation.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 饿汉式：静态代码块
 */
public class Singleton02 implements Serializable {
    @Serial
    private static final long serialVersionUID = 929885334678391400L;

    private static final Singleton02 SINGLETON_02;

    static {
        SINGLETON_02 = new Singleton02();
    }

    private Singleton02() {

    }

    public static Singleton02 getInstance() {
        return SINGLETON_02;
    }
}
