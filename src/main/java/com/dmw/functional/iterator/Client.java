package com.dmw.functional.iterator;

import com.dmw.creation.prototype.Student;

/**
 * @author: 邓明维
 * @date: 2022/9/14
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student());
        studentAggregate.addStudent(new Student());
        studentAggregate.addStudent(new Student());
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
