package com.pankx.collectionDemo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AppleTest {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 10; i > 0; i--){
            Apple apple = new Apple();
            apple.setColor("color" + i);
            apple.setWeight(12+i);
            apples.add(apple);
        }

        printApple(apples);
        //排序
        Collections.sort(apples,new CompareWithColor());
        System.out.println("=======================");
        printApple(apples);
        System.out.println("=======================");
        Collections.sort(apples,new CompareWithWeight());
        printApple(apples);
    }

    public static void printApple(ArrayList<Apple> apples){
        Iterator<Apple> iterator = apples.iterator();
        while(iterator.hasNext()){
            Apple apple = iterator.next();
            System.out.println("color:" + apple.getColor() + " weight :" + apple.getWeight());
        }
    }
}
