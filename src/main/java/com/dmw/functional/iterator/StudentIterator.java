package com.dmw.functional.iterator;

import com.dmw.creation.prototype.Student;

/**
 * 定义迭代器接口，声明hasNext、next方法
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}