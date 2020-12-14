package com.pankx.collectionDemo;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * List使用实例
 */
public class ListDemo {
    public static void main(String[] args){
        //定义List的实现类ArrayList的对象
        ArrayList  arrayList = new ArrayList();
        //给arrayList对象添加元素
        arrayList.add("xiaoming");
        arrayList.add("xiaoqing");
        arrayList.add("xiaohong");

        //使用for循环遍历arrayList中的所有元素
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("第"+i+"个元素为：" + arrayList.get(i));
        }
        //使用迭代器遍历arrayList所有的元素
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
