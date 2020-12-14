package com.pankx.Exception;

/**
 * 自定义异常的使用
 */
public class CustomException {

    public static void main(String[] args) {
        try {

            ExceptionDemo.check(2,3,6);

        }catch (SpecialException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
}


/**
 * 使用自定义异常类
 */

class ExceptionDemo {

    public static boolean check(int a , int b , int c) throws SpecialException{
        if(a + b < c){
           throw new  SpecialException();
        }else if (a + c < b){
            throw new SpecialException();
        }else if (b + c < a){
            throw new SpecialException();
        }
        return true;
    }
}

/**
 * 自定义异常类的定义
 */
class SpecialException extends Throwable {

    public String getMessage(){
        return "SpecialException构造三角形失败";
    }

    public String toString(){
        return "三角形构造异常，类型为" + this.getClass().getName();
    }

    public void printStackTrace(){
        System.out.println("三角形构造失败，异常类型：" + this.getClass().getName());
    }
}