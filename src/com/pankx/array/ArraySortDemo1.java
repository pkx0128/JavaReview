package com.pankx.array;

import java.util.Arrays;
/**
 * 数组排序
 * @author pankx
 *
 */
public class ArraySortDemo1 {

	public static void main(String[] args) {
		int[] age = {12,3,1,4,7,8};
		printAge(age);
		//使用Arrays.sort对数组进行排序，此方法可对数组元素为基本数据类型与String类型有效，
		//自定义类型需实现comparable接口并重写compareTo方法自定义排序规则后才可调用Arrays.sort方法排序
		Arrays.sort(age);
		printAge(age);
	}
	
	public static void printAge(int[] age) {
		for(int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
	}
}
