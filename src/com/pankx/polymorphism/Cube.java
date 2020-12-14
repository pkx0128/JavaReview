package com.pankx.polymorphism;

/**
 * 传统方式计算立方体的体积
 */
public class Cube {
    private Double length;

    public Cube(Double length){
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    /**
     * 计算立方体体积
     *
     * @return 返回立方体的体积
     */
    public Double getVolum(){
        return Math.pow(length,3);
    }
}
