package com.pankx.extendsDemo;

/**
 * 继承中方法重写的实例
 */
public class OverrideDemo {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.shout();
        Animal animal = new Animal();
        animal.shout();
    }
}


class Animal {
    public String name;
    public String color;
    public int age;

    public void shout(){
        System.out.println("Animal会叫。。。");
    }
}

class Cat extends Animal {
    public void shout(){//重写父类的shout方法
        System.out.println("cat类重写后的shout方法");
    }
}