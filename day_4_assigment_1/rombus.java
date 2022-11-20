package day_4_assigment_1;

import java.util.Scanner;

public class rombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int space=n-1;
		int star=5;
		
		
		while(row<=n) {
			
			
			// space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			// star
			
			int j=1;
			while(j<=star) {
				if(j==1 || j==n ||row==1 ||row==star) {	
				  System.out.print("*");
				 }else {
					 System.out.print(" "); 
				 }
				j++;
			}
			
			//row
			
			System.out.println();
			row++;
			space--;
			
			
			
			
			
		}
	}

}
