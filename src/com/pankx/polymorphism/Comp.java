package com.pankx.polymorphism;

/**
 * （传统方式）创建comp类，其中有很我计算体积的静态方法
 */
public class Comp {
    //计算立方体的体积
    public static double getCubVolum(Cube cube){
        return cube.getVolum();
    }
    //计算圆锥的体积
    public static double getCylinder(Cylinder cylinder){
         return cylinder.getVolum();
    }

}

