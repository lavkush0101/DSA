package Lecture4;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=10;
		int a=0;
		int b=1;
		
		int i=1;
		while(i<=n) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println("series  "+a+"..."+b);
			i++;
			
		}
	
		System.out.println(a +" is  fibonacci ");
		

	}

}
