package com.pankx.oop;

public class Test {
    public static void main(String[] args) {
        Students sts = new Students();
        sts.init("pankx",12,"男");
        sts.display();
    }
}

class Students{
    String name;
    int age;
    String sex;

    Students(){

    }

    Students(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void init(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

     void display(){
        System.out.println("运行成功");

    }
}

