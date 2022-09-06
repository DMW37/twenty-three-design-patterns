package com.dmw.creation.prototype;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public class Student implements Cloneable{
    Pen pen = new Pen();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student();
    }
}
