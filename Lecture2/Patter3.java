package Lecture2;

import java.util.Scanner;

public class Patter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); // no of row 
		
		int row=1;  // initial row value
		int star =n;  // initial star value 
		
		while(row<=n) {
			
			// inner loop for print the star  for the single row 
			int i=1;
			while(i<=star) {  // check the case no start to print 
				System.out.print("* ");
				i++;
			}
			
			row++;// update the row value 
			System.out.println(); // for the update the row 
			star--;  // update the star value 
		}
	}

}
