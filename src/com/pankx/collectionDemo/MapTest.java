package com.pankx.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * map简单实例
 * 记录随机生成的数的次数
 */
public class MapTest {
    public static void main(String[] args ){

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        Random random = new Random(47);
        for(int i = 0; i < 1000000; i++){
            Integer tmp = m.get(i);
            m.put(random.nextInt(20),tmp == null? 1 : tmp + 1);
        }
        System.out.println(m);
    }
}
