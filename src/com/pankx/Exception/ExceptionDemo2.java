package com.pankx.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 传播异常或声明异常
 */
public class ExceptionDemo2 {

    public static void main(String[] args) {
        ExceptionDemo2 e = new ExceptionDemo2();
        try {
            e.readFile(new File("/volumes/ios/text.txt"));
        } catch (IOException ex) {
            System.out.println("文件读取错误");
        }
    }

    public void readFile(File file) throws FileNotFoundException, IOException {
        FileInputStream fls = new FileInputStream(file);
        int r = fls.read();
    }
}
