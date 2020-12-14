package com.pankx.staticDemo;

public class StaticCodeDemo {

    public static void main(String[] args){
        Person p = new Person();
        p.display();
    }

}

class Person {
    public static String eat;
    static{
        eat = "人类会吃饭";
        System.out.println("类的静态代码块执行");
    }

    public String name;
    public int age;

    public void display(){
        System.out.println("行为：" + eat + "名字：" + name + "年龄：" + age);
    }
}
