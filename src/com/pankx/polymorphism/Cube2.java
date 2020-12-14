package com.pankx.polymorphism;

/**
 * 多态方式计算正方体体积
 */
public class Cube2 extends Volum {
    private Double length;

    public Cube2(Double length){
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public double getVolum(){
        System.out.println("Cube2中的getVolum方法被调用");
        return Math.pow(length,3);

    }
}
