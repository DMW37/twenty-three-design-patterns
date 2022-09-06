package com.dmw.creation.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:  懒汉式：5--volatile
 */
public class Singleton08 implements Serializable,Cloneable {
    @Serial
    private static final long serialVersionUID = -1561532189595667925L;
    private static volatile Singleton08 singleton08;

    private Singleton08() {

    }

    public static Singleton08 getInstance() {
        if (singleton08 == null) {
            synchronized (Singleton07.class) {
                if (singleton08 == null) {
                    singleton08 = new Singleton08();
                }
            }
        }
        return singleton08;
    }
}
