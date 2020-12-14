package com.pankx.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * 设置Student中的排序规则是否成功
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i = 10; i > 0; i--){
            Student student = new Student();
            student.setSnum(0000 + i);
            student.setName("name" + i);
            student.setAge(20);
            student.setSex("MAIL");
            students.add(student);
        }
        System.out.println(students.size());
        printStudent(students);

        System.out.println("=========================");

        Collections.sort(students);
        printStudent(students);
    }



    public static void printStudent(ArrayList<Student> students){

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();
            System.out.println("Snum: " + s.getSnum() + " name: " + s.getName() + " age: " + s.getAge() + " sex:" + s.getSex());
        }
    }
}
