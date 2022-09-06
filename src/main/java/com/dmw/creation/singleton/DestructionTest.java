package com.dmw.creation.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description: 以静态内部内为例，做破坏测试和反破坏测试
 */
public class DestructionTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 序列化测试
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        Singleton09 instance = Singleton09.getInstance();
        objectOutputStream.writeObject(instance);
        objectOutputStream.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
        Object o = inputStream.readObject();
        inputStream.close();
        System.out.println(instance==o);

        // 反射，定义一个标记
        // 克隆，重写克隆方法

    }
}
