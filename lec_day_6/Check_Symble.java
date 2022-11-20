package lec_day_6;

import java.util.Scanner;

public class Check_Symble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		char ch = sc.next(".").charAt(0);
		sc.close(); 
		
		if((int)(ch)<=122 && (int)(ch)>=97 ) {
			System.out.println("lowercase");	
		}else if((int)(ch)>=65 && (int)(ch)<=91 ) {
			System.out.println("UPPERCASE");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
