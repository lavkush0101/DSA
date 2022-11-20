package Lecture2;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	
	int row =1;
	int star =n;
	int space =1;
	
	
	while(row<=n) {// for the row 
		
		// space 
		int i=1;
		while(i<=space) {
			System.out.print("  ");
			i++;
		}	 
		
		// star
		int j=1;
		while(j<=star) {
			System.out.print("* ");
			j++;
		}
		
		//row
		System.out.println();
		row++;
		star--;
		space=space+2;
		
	}

	}

}
