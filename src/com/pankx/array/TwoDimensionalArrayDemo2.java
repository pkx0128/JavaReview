package com.pankx.array;

import java.util.Arrays;

/**
 * 二维数组动态初始化实例
 * @author pankx
 *
 */
public class TwoDimensionalArrayDemo2 {
	public static void main(String[] args) {
		int[][] num = new int[4][];
		num[0] = new int[3];
		num[1] = new int[4];
		num[2] = new int[5];
		num[3] = new int[6];
		//输出二维数组
		System.out.println(Arrays.deepToString(num));
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
