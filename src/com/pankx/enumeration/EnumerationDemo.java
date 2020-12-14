package com.pankx.enumeration;

enum Sex{
    MAIL,FMAIL
}

public class EnumerationDemo {
    /**
     * 定义sex枚举
     */
    public static void main(String args[]){
        Person p = new Person();
        p.setName("xiaoming");
        p.setAge(22);
        p.setSex(Sex.FMAIL);
        System.out.println("name: " + p.getName() + " age: " + p.getAge() + " sex: " + p.getSex());
    }
}

class Person {
    private String name;
    private int age;
    private Sex sex;

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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

