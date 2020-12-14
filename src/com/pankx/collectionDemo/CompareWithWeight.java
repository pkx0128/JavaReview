package com.pankx.collectionDemo;

import java.util.Comparator;

public class CompareWithWeight implements Comparator<Apple> {

    public int compare(Apple apple1,Apple apple2){
        if(apple1.getWeight() > apple2.getWeight()){
            return 1;
        }else if(apple1.getWeight() < apple2.getWeight()){
            return -1;
        }else {
            return 0;
        }
    }
}
