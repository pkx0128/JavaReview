package com.pankx.polymorphism;

/**
 * 多态实例
 */
abstract public class DrowShape {
    abstract public void Drow();
}

/**
 * 画圆
 */
class Circle extends DrowShape {
    public void Drow(){
        System.out.println("画圆");
    }
}

/**
 * 画三角形
 */
class Triangle extends DrowShape {
    public void Drow(){
        System.out.println("画三角形");
    }
}

class DrowShapes {
    public static void getDrowShape(DrowShape shape){
         shape.Drow();
    }
}

class TestDrow {
    public static void main(String[] args){
        Circle circle = new Circle();
        DrowShapes.getDrowShape(circle);

        Triangle triangle = new Triangle();
        DrowShapes.getDrowShape(triangle);
    }
}