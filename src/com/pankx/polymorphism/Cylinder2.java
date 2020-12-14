package com.pankx.polymorphism;

public class Cylinder2 extends Volum {
    private double r;
    private double height;

    public Cylinder2(double r , double height){
        this.r = r;
        this.height = height;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolum(){
        System.out.println("Cylinder2中的getVolum方法被调用");
        return Math.PI * r * r * height;
    }

}
