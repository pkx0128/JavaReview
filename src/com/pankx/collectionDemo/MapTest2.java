package com.pankx.collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 通过key获取指定的值
 */
public class MapTest2 {
    public static void main(String[] args){
        Map<String,Person2> map = new HashMap<String,Person2>();
        map.put("student",new Person2("xiaoming",12));
        map.put("teacher",new Person2("gaohui",30));
//        System.out.printlntln(map);
//        System.out.println(map.get("student").getName());
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String p = iterator.next();
            System.out.println("key: " + p + " value: " + map.get(p));
        }
    }
}
class Person2{
    private String name;
    private int age;

    public Person2(String name,int age){
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
}

