package dout_class_3;

import java.util.Scanner;

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				String s = str.substring(i,j);
				
				System.out.println(s);
				checkVowel(str);
			}
			
		}
		
	}

	private static boolean checkVowel(String str) {
		
		int i=0;
		while(i<str.length()) {
			 
		}
		
	}

}
//