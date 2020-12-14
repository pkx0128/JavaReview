package com.pankx.oop;
/**
 * 构造方法：1.方法名与类名相同 2.没有返回值类型 3.构造方法的调用必须使用new关键字
 * @author pankx
 *
 */
public class ConstructorDemo {
	public static void main(String agrs[]) {
		Person p = new Person("pankx",12);
		p.displayPerson();
	}
}

class Person{
	private String name;
	private int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void displayPerson() {
		System.out.println("信息为：" + this.name + "," + this.age);
	}
}