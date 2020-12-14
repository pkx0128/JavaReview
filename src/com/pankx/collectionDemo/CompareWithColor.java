package com.pankx.collectionDemo;

import java.util.Comparator;

public class CompareWithColor implements Comparator<Apple> {

    public int compare(Apple apple1,Apple apple2){
        return apple1.getColor().compareTo(apple2.getColor());
    }
}

