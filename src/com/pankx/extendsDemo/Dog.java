package com.pankx.extendsDemo;

/**
 * 定义父类Dog
 */
public class Dog {
    private String name;//私有成员属性不能被继承
    protected int age;
    public String color;

    Dog(){
        System.out.println("Dog的构造方法！");
    }

    public void shout(){
        System.out.println("狗会叫。。。。");
    }
}

class GuideDog extends Dog {
    public String dest;

    GuideDog(){
        System.out.println("GuideDog的构造方法！");
    }

    public void guide (String dest){
        System.out.println("导航到目的地" + dest);
    }
}

class test {
    public static void main(String args[]){
        GuideDog gd = new GuideDog();
//        Dog d = new Dog();
    }
}
