package com.pankx.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Set的使用实例，Set是一个接口，默认情况下使用其实现类HashSet,
 * HashSet中存储的数据为无序的，
 * LinkedHashSet为有序的且为数据的插入顺序
 * TreeSet中的元素顺序为元素的自然顺序
 */
public class SetDemo {
    public static void main(String[] args){
        System.out.println("HashSet开始。。。。");
        //创建hashset对象
        HashSet hashset = new HashSet();
        for(int i = 0; i < 10; i++ ){

            hashset.add("xiaoming" + i);
            hashset.add("xiaoqin" + i);
        }

        //定义一个迭代器
        Iterator iterator = hashset.iterator();
        //通过迭代器对象遍历hashSet中的所有有元素值
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("LinkedHashSet开始。。。。。");
        //定义LinkedHashSet对象
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        //给LinkedHashSet对象插入值
        for(int i = 0; i < 10; i++ ){
            linkedHashSet.add("xiaoming" + i);
        }
        //创建迭代器对象
        Iterator iterator1 = linkedHashSet.iterator();
        //遍历linkedHashSet中的元素
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("TreeSet开始。。。。");
        TreeSet treeSet = new TreeSet();
        treeSet.add("xiaoming4");
        treeSet.add("xiaoming2");
        treeSet.add("xiaoming1");

        Iterator iterator2 = treeSet.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }



    }
}
