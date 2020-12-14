package com.pankx.extendsDemo;

/**
 * 方法的重写与重载实例
 */
public class OverloadAndOverrideDemo {

    public static void main(String[] args){
        Person p = new Person();
        p.display();
        Student s = new Student();
        s.display();
        s.display("ppppp");
    }
}

class Person {
    public String name;
    public void display(){
        System.out.println("Person的display类" + this.name);
    }
}

class Student extends Person {
    public void display(){//重写父类Person的display方法
        System.out.println("Student 类的display方法" + name);
    }

    public void display(String name){
        System.out.println("重载Student类的的display方法" + name);
    }


}