package com.dmw.creation.prototype;

/**
 * @author: 邓明维
 * @date: 2022/9/6
 * @description:
 */
public class ProtoTypeByStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        Student clone = (Student) student.clone();
        System.out.println(student==clone);
        System.out.println(student.pen==clone.pen);
    }
}
