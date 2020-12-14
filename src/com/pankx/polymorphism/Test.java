package com.pankx.polymorphism;

public class Test {

    public static void main(String agr[]){
        Cube2 c = new Cube2(10.0);
        Double cubevolum = Comp2.getVolem(c);

        Cylinder2 cylinder = new Cylinder2(12.0,10.0);
        Double Cylinder  = Comp2.getVolem(cylinder);
    }
}
