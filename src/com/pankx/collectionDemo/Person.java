package com.pankx.collectionDemo;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 创建一个person，并实现同一个身份证号认为是同一个人
 */
public class Person {
    private String carNun;
    private String name;
    private String sex;
    private Date birthday;
    private String address;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCarNun() {
        return carNun;
    }


    public void setCarNun(String carNun) {
        this.carNun = carNun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //重写Object中的hashCode方法
    public int hashCode(){
        return this.carNun.hashCode();
    }

    public boolean equals(Object object){
        if(object instanceof Person){
            Person p = (Person) object;
            return this.carNun.equals(p.getCarNun());
        }else {
            return false;
        }
    }
}

class Test {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        for(int i = 0; i < 10; i++){
            Person p = new Person();
            p.setName("name" + i);
            if(i % 2 == 0){
               p.setCarNun("123456789");
               p.setSex("女");
            }else{
                p.setCarNun("12345666789" + i);
                p.setSex("男");
            }
            hashSet.add(p);
        }

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Person p = (Person) iterator.next();
            System.out.println("name:" + p.getName() + " carNum: " + p.getCarNun() + " sex:" + p.getSex());
        }

    }
}
