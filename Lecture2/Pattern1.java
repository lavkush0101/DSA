package Lecture2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();// input row
		
		int row=1;  // for the main loop 
		int star=n;// for second while loop
		while(row<=n) {
			
			int i=0;
			while(i<=star) {
				System.out.print("* ");
				i++;
				
			}
			System.out.println( );
			row++;
		}
		

	}

}
