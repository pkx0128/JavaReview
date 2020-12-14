package com.pankx.extendsDemo;

/**
 * 重写实例
 */
public class ImageOperation {
    public void read(){
        System.out.println("从硬件读取图片。。。");
    }

    public void handle(){
        System.out.println("图像去噪声。。。");
    }

    public void show(){
        System.out.println("显示图像。。。");
    }
}

class MyImageOperation extends ImageOperation{

    public void read(){
        System.out.println("从文件读取图像");
    }

    /**
     * 重写handle方法使用具有去噪声和锐化
     */
    public void handle(){
        super.handle();//调用父类的handle方法，使子类handle也有父类定义的功能
        System.out.println("图像锐化");
    }
}

class Test {

    public static void main(String arg[]){
        MyImageOperation myImageOperation = new MyImageOperation();
        myImageOperation.handle();
    }

}