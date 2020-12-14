package com.pankx.array;
/**
 *  数组的初始化
 *  
 * @author pankx
 *
 */
public class ArrayDemo1 {

	public static void main(String[] args) {
		//静态初始化
		String[] animal = {"cat","dog"};
		//动态初始化
		int[] age = new int[animal.length];
		//给age数组元素赋值
		for(int i = 0; i < animal.length; i ++ ) {
			age[i] = 10 + i;	
		}
		//读取数组元素的值
		for(int i = 0; i < animal.length; i++) {
			System.out.println("动物名称: " + animal[i] + " 年龄：" + age[i] );			
		}
		
	}
}
