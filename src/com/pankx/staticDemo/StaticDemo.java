package com.pankx.staticDemo;

public class StaticDemo {

    public static void main(String[] args){
        Student.schoolName = "清华大学";//通过类名直接访问类的静态属性
        Student s = new Student();
        Student s2 = new Student();
        s.name = "xiaomaing";
        System.out.println("学校名称：" + s.schoolName);//通过对象访问类的成员属性
        s2.name = "xiaohong";
        s.display();
        s2.display();
    }

}

class Student {
    public static String schoolName;//定义类的静态成员属性
    public String name;
    public int age;
    public String sex;

    public void display(){
        System.out.println("学校：" + schoolName + " 学生名：" + name + " 年龄：" + age + " 姓别：" + sex);
    }
}
