package Lecture2;

import java.util.Scanner;

public class Patter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int row =1;
		int space=0;
		int star =n;
		
		while(row<=n) {// first row 
			
			// space 
			
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// star
			
			int j=0;
			while(j<=star-1) {
				System.out.print("* ");
				j++;
			}
			
			// row 
			
			System.out.println();
			row++;
			space++;
			star--;
			
			
			
				
			
			
		}
		
	}

}
