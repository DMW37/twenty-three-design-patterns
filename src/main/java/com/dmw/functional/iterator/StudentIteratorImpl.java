package com.dmw.functional.iterator;

import com.dmw.creation.prototype.Student;

import java.util.List;

/**
 * 定义具体的迭代器类，重写所有的抽象方法
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}