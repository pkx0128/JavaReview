package com.pankx.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 捕获异常实例
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {
        File file = new File("/volumes/ios/text.txt");
        FileInputStream fils = null;

        try {

            fils = new FileInputStream(file);
            int r = fils.read();
        }catch (FileNotFoundException e){
            System.out.println("找不到文件");
        }catch(IOException e){
            System.out.println("文件读取错误");
        }finally {
            System.out.println("程序运行结束");
        }
    }
}
