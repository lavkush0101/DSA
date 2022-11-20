package lav;

import java.util.Scanner;

public class Patter_31 {

	public static void main(String[] args) {
		 
			
			
		int n=5;
		int row=1;
		int star=n;
		int place=n;
		
		while(row<=n) {
			
			// star
			int i=n;
			while(i>=star) {
				 if(i==place) {
					 System.out.print("* ");
				 }else {
					 System.out.print(i+" ");
				 }
				 i--;
			}
			
			//row
			
			
			row++;
			place--;
			System.out.println();
		}
	}

}
