package com.pankx.abstractDemo;

/**
 * 抽象类的实例
 */
public class AbstractDemo {

    public static void main(String[] args){
        Dog d = new Dog("xiaobai",22);
        d.shout();
        d.shout(d.getName(),d.getAge());
    }

}


abstract class Animal{
    private String name;
    private int age;

    public Animal(String name , int age){
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

    //定义shout抽象方法，没有方法体，只能被子类重写
    abstract public void shout();
}

//抽象类派生出Dog类

class Dog extends Animal{

    public Dog(String name , int age){
        super(name,age);//调用父类的构造方法初始华成员变量的值
    }

    public void shout(){//重写父类的抽象方法shout
        System.out.println("重写Animal父类的抽象方法shout");
    }
    public void shout(String name , int age){//重载shout方法实现name与age值的输出
        System.out.println("name:" + name + " age:" + age);
    }
}

