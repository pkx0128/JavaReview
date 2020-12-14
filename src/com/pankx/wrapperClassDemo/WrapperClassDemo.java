package com.pankx.wrapperClassDemo;

public class WrapperClassDemo {

    public static void main(String[] args){

        //获取包装器类对象
        Integer integer = new Integer(12);
        //或者
        Integer integer1 = Integer.valueOf(12);

        String s = "1235";

         int b = Integer.parseInt(s);


        //包装器类对象转为基本数据类型
        int i = integer.intValue();
        System.out.println(integer == integer1);
    }
}
