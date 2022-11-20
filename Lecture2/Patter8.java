package Lecture2;

import java.util.Scanner;

public class Patter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int row=1;
		int star=n;
		int space=0;
		
		
		while(row<=n) {
			
			//space 
			int i=1;
			while(i<=space) {
				if(row==1 && row==n) {
				 
				 System.out.print("* ");
				}
				i++;
			}
			
			// star
			int j=1;
			while(j<=star) {
				if(j!=1 && j!=n) {
				  System.out.print("  ");
				}else {
					System.out.print("*  ");
				}
				j++;
			}
			
			
			// row 
			System.out.println();
			row++;
			
		
			
		}
		

	}

}
