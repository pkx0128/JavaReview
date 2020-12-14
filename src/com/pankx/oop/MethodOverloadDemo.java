package com.pankx.oop;
/**
 * 方法重载实例
 * @author pankx
 *
 */
public class MethodOverloadDemo {

	public static void main(String args[]) {
		Clock cl1 = new Clock();
		cl1.setTime(12);
		cl1.displayClock();
		
		Clock cl2 = new Clock();
		cl2.setTime(12,11);
		cl2.displayClock();
		
		Clock cl3 = new Clock();
		cl3.setTime(12, 11, 13);
		cl3.displayClock();
	}
	
}

class Clock{
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int hour) {
		this.hour = hour;
		this.minute = 0;
		this.second = 0;
	}
	
	public void setTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
	}
	
	public void setTime(int hour,int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void displayClock() {
		System.out.println("时间为："+hour +":"+ minute +":"+ second);
	}
	
}
