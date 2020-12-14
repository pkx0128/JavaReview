package com.pankx;

/**
 * String用法实例
 */
public class StringDemo {

    public String upcase(String s){
        return s.toUpperCase();
    }

}

class Test {
    public static void main(String[] args){
        String s = "hello";
        System.out.println(s);
        String s1 = new StringDemo().upcase(s);
        System.out.println(s);
        System.out.println(s1);
    }
}