package com.pankx.encapsulation;

/**
 * 封装实例
 */
public class Student {
    private String name;
    private String sex;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return this.sex;
    }

    public void setAge(int age){
        if(age < 0 || age > 120){
            System.out.println("年龄输入错误");
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }
}

class Test{
    public static void main(String[] args){
        Student s = new Student();
        s.setAge(110);
        System.out.println(s.getAge());
    }
}
