package com.pankx.io;


import java.io.File;
/**
 * File表示文件实例
 */
public class FileDemo {
    public static void main(String[] args){
        //创建File文件对象（或将/volumes/ios/test.txt抽象化为一个File的实例）
        File file = new File("/volumes/ios/test.txt");
        //获取文件名并输出到控制台
        System.out.println(file.getName());
        //获取文件的绝对路径并输出到控制台
        System.out.println(file.getPath());
        //获取文件的上层目录并输出到控制台
        System.out.println(file.getParent());
        //判断文件是否有读权限
        System.out.println(file.canRead());
        //判断文件是否有写权限
        System.out.println(file.canWrite());
        //判断当前file对象是否为文件
        System.out.println(file.isFile());
        //判断当前file对象是否为目录
        System.out.println(file.isDirectory());
        //获取当前file的最后修改时间
        System.out.println(file.lastModified());

    }
}
