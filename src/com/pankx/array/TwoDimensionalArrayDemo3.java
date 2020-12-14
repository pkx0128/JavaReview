package com.pankx.array;
/**
 * 二维数组的运用
 * @author pankx
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArrayDemo3 {
	
	public static void main(String[] args) {
		
		StudentDemo sd = new StudentDemo();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String choose = null;
		try {
			choose = input.readLine();
			System.out.println(sd.name.length);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 0 ; i < sd.name.length; i++ ) {
//				System.out.println(sd.name[i]);
				for(int j = 0 ; j < sd.grades[i].length; j++) {
//					System.out.println(sd.grades[i].length);
					if(sd.name[i].equals(choose)) {
						System.out.println("学生名字：" + sd.name[i] + "学生成绩具体如下："+
								sd.gradeName[j]+"成绩为："+sd.grades[i][j]);
					}
				}
			}
		
	}

}

class StudentDemo{
	String[] name = {"xiaoming","xiaohong","xiaoqing","xiaolan","xiaoli",
			"xiaopan","xiaozhang","xiaowang","xiaozheng","xiaoqin"};
	int[][] grades = {{50,65,67,34,56,77},{55,87,98,77,66,56},
			{86,99,90,67,87,67},{90,98,99,88,77},
			{99,89,90,80,87,77},{98,98,54,33,67,87},
			{87,75,67,48,29,98},{88,66,56,66,66,44},
			{87,75,67,48,49,98},{88,66,56,56,66,44}};
	String[] gradeName = {"java","c++","python","php","html","javaScript"};
}