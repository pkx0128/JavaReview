package com.pankx.polymorphism;

/**
 * 传统方式圆柱体
 */
public class Cylinder {
    private Double r;
    private Double height;

    public Cylinder(Double r , Double height){
        this.r = r;
        this.height = height;
    }

    /**
     * 计算圆锥体的体积
     * @return 返回圆锥体的体积
     */
    public double getVolum(){
        return Math.PI * r * r * height;
    }

}
