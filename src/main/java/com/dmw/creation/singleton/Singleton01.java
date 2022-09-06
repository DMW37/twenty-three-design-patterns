package com.dmw.creation.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 饿汉式：单例模式
 */
public class Singleton01 implements Serializable {
    @Serial
    private static final long serialVersionUID = 3604472638258158006L;

    private static final Singleton01 SINGLETON_01 = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return SINGLETON_01;
    }
}
