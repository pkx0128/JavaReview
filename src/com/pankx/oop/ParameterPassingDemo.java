package com.pankx.oop;
/**
 * 方法的参数传递，1.基本数据类型为值传递
 * 				2.引用类型为地址传递
 * 
 * @author pankx
 *
 */
public class ParameterPassingDemo {
	public static void main(String args[]) {
		int a = 10;
		int sum = add(a);
		System.out.println(a);//由于基本数据类型参数传递为值传递，故调用add方法修改方法中的a的值时不会改变main方法中的a的值
		System.out.println(sum);
		Student st1 = new Student();
		st1.age = 10;
		changeAge(st1);//由于引用类型参数传递为地址传递，因此changeAge方法中对对student对象的age属性修改,main方法中的st1.age的值也会同时改变
		
		System.out.println(st1.age);
	}
	
	public static int add(int a) {
		return a += 1;
	}
	
	public static void changeAge(Student student) {
		student.age = student.age + 1;
	}
}

class Student{
	String name;
	int age;
}
