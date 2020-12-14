package com.pankx.array;

import java.util.Arrays;

/**
 * 使用System.arraycopy()方法实现数组复制
 * @author pankx
 *
 */
public class ArrayCopyDemo2 {
	
	public static void main(String[] args) {
		String[] person = new String[3];
		person[0] = "xiaoming";
		person[1] = "xiaohong";
		person[2] = "xiaoqing";
		
		String[] person2 = new String[person.length];
		//使用System.arraycopy()方法复制数组
		System.arraycopy(person, 0, person2, 0, person.length);
		
		System.out.println(Arrays.deepToString(person));
		System.out.println(Arrays.deepToString(person2));
	}

}
