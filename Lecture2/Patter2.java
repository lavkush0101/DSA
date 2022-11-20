package Lecture2;

import java.util.Scanner;

public class Patter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();// no of row
		
		int row=1;
		int star=1; // no star 
		while(row<=n) {
			
			// row no of star
			int i=0;
			while(i<star) {
				// print the start
				System.out.print("* ");
				i++;
				
			}
			// update the row  and no star value
			row++;  // update row
			star++; // update the star
			// chanage the line 
			System.out.println();
		}

	}

}
