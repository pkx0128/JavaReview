package com.pankx.innerClass;

/**
 * 内部类对象访问外部类的属性示例
 */
public class InnerClassDemo2 {
}


interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sort{

    private Object[] items;
    private int next = 0;
    public Sort(int size){
        items = new Object[size];
    }


}