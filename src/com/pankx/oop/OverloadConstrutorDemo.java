package com.pankx.oop;

/**
 * 构造方法的重载实例
 */
public class OverloadConstrutorDemo {

    public static void main(String[] args) {
//         School s = new School("pankx");
         School s1 = new School(12);
         School s2 = new School(12,"男");
         System.out.println(s2.getName());

    }

}

class School {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    School(String name){
        this.name = name;
        System.out.println("只有一个name参数的构造器执行");
    }

    School(int age){
        this("pankx");
        System.out.println("只有一个age参数的构造方法执行");
    }

    School(int age,String sex){
        this("pankx");
        this.age = age;
        this.sex = sex;
        System.out.println("只有age,和sex参数的构造方法执行");
    }
    School(String name , int age , String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("三个参数的构造方法执行");
    }

}
