package com.pankx.objectDemo;

/**
 * Object的toString方法的重写改变toString的返回自定义字符串
 */
public class ObjectDemo {
    public static void main(String args[]){
        Student s = new Student("pp",12);

        System.out.println(s.toString());


    }

}


class Student{
    private String name;
    private int age;

    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return this.name;
    }
}

