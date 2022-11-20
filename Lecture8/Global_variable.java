package Lecture8;

import java.util.Scanner;

public class Global_variable {

	static int val=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		System.out.println(val);
		fun1();
		fun2();
		System.out.println("bye");
		System.out.println(val);
		

	}
	
	public static void fun2() {
		System.out.println("hey fun");
		int  val=9;
		val=val+5;
		System.out.println(val);
	}
	
	public static void fun1() {
		System.out.println("hey fun");
		val=val+5;
		System.out.println(val);
	}

}
