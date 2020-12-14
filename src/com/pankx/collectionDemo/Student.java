package com.pankx.collectionDemo;

/**
 * 定义Student通过实现接口Comparable中的compareTo方法设置根据学号排序规则
 */
public class Student implements Comparable<Student> {

    private long Snum;
    private String name;
    private int age;
    private String sex;

    public long getSnum() {
        return Snum;
    }

    public void setSnum(long snum) {
        Snum = snum;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int compareTo(Student student){
        if(this.getSnum() > student.getSnum()){
            return 1;
        }else if (this.getSnum() < student.getSnum()){
            return -1;
        }else {
            return 0;
        }
    }
}
