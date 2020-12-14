package com.pankx.assertdemo;

/**
 * 断言的使用实例
 */
public class AssertDemo {

    public static void main(String[] args){
        new Triangle(3,5,7);
    }
}

class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a , int b , int c){

        assert(a + b < c):"不满足两边和大于第三边";
        assert(a + c < b):"不满足两边和大于第三边";
        assert(b + c < a):"不满足两边和大于第三边";

        this.a = a;
        this.b = b;
        this.c = c;
    }
}