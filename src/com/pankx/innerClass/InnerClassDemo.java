package com.pankx.innerClass;

public class InnerClassDemo {

    public static void main(String grs[]){
        Person p = new Person();
        p.display();
        //静态方法中访问Person类中的内部类
        Person.Student student = new Person().new Student("name",33);
        student.display();
    }

}

class Person {

    /**
     * 定义内部类Student
     */
    class Student {
        private String name;
        private int age;

        public Student(String name , int age){
            this.name = name;
            this.age = age;
        }

        public void display(){
            System.out.println("name: " + name + " age: " + age);
        }

    }

    /**
     * 定义内部类Teacher
     */
    class Teacher {
        private String name;
        private String teachclass;

        public Teacher(String name , String teachclass){
            this.name = name;
            this.teachclass = teachclass;
        }


        public void display(){
            System.out.println("name: " + name + " teachclass: " + teachclass);
        }
    }

    public void display(){//外部类中的非静态访问内部类跟正常类的访问方式一样
        Student student = new Student("student",12);
        student.display();
        Teacher teacher = new Teacher("teacher","java");
        teacher.display();

    }
}

