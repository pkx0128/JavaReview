package com.pankx.array;

import java.util.Arrays;

/**
 * 二维数组静态初始化实例
 * @author pankx
 *
 */
public class TwoDimensionalArrayDemo {
	public static void main(String[] args) {
		//二维数组的静态初始化
		int[][] num = {{1,2,3},{5,6,7},{8,9,10}};
		//遍历数组所有元素
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j ++ ) {
				
				System.out.print(num[i][j]);
			}
//			System.out.println();
		}
		
		System.out.println();
		System.out.println(Arrays.deepToString(num));
		
	}
}
