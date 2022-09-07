package com.dmw.creation.singleton;

import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 懒汉式：双重检索
 */
public class Singleton07 implements Serializable {

    private static final long serialVersionUID = -8746267629620211091L;

    private static Singleton07 singleton07;

    private Singleton07() {

    }

    public static Singleton07 getInstance() {
        if (singleton07 == null) {
            synchronized (Singleton07.class) {
                if (singleton07 == null) {
                    singleton07 = new Singleton07();
                }
            }
        }
        return singleton07;
    }
}
