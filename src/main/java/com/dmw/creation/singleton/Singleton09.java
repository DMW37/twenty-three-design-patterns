package com.dmw.creation.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 静态内部类:安全，懒加载
 */
public class Singleton09 implements Serializable,Cloneable{
    @Serial
    private static final long serialVersionUID = 5195577216141296569L;


    private static class InnerSingleton09 {
        private static final Singleton09 SINGLETON_09 = new Singleton09();
    }

    private Singleton09() {
    }

    public static Singleton09 getInstance() {
        return InnerSingleton09.SINGLETON_09;
    }

    /**
     * 反序列化时，会调用的方法
     * @return
     */
    public Object readResolve(){
        return InnerSingleton09.SINGLETON_09;
    }

}
