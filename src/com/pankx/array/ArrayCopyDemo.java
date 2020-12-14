package com.pankx.array;

import java.util.Arrays;

/**
 * 数组的复制实例
 * @author pankx
 *
 */
public class ArrayCopyDemo {
	
	public static void main(String[] args) {
		String[] person = {"xiaomin","xiaohong","xiaoqing"};
		String[] person2 = new String[person.length];
		//使用for循环将数组元素读取出来并赋给新数组，从而实现数组复制
		for(int i = 0; i < person.length; i ++) {
			person2[i] = person[i];
		}
		//Arrays.deepToString()将数组转为字符串
		System.out.println(Arrays.deepToString(person));
		System.out.println(Arrays.deepToString(person2));
	}
}
