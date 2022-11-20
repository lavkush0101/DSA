package Lecture15;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		int i=0;
		while(i<str.length()) {
			System.out.println(str.charAt(i));
			
			
			i++;
		}
		
		
	}

}
