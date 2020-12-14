package com.pankx.array;

import java.util.Arrays;
/**
 * 自定义类型数组元素排序实例
 * @author pankx
 *
 */
public class ArraySortDemo2 {

	public static void main(String[] args) {
		Student[] s = new Student[4];
		s[0] = new Student(3,"xiaoming");
		s[1] = new Student(1,"xiaohong");
		s[2] = new Student(2, "xiaoqin");
		s[3] = new Student(4, "xiaoqin");
		Arrays.sort(s);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("学号：" + s[i].getNum() + "姓名：" + s[i].getName());
			
		}
	}
}

class Student implements Comparable<Student> {
	
	private int num;
	private String name;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public Student(int num,String name) {
		this.num = num;
		this.name = name;
	}
	
	public int compareTo(Student student) {
		if(this.num < student.num) {
			return -1;
		}else if(this.num > student.num) {
			return 1;
		}else {
			return 0;			
		}
	}


}