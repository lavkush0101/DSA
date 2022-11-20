package Lecture4;

import java.util.Scanner;

public class pasacal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=0;
		int star=1;
		
		
		while(row<n) {
			
			// star
			
			int j=1;
			int val=1;
			int i=0;
			while(i<star) {
			   System.out.print(val+" ");
				val=(val*(row-i))/(i+1);
				i++;
			}
			
			// row
			
			System.out.println();
			row++;
			star++;
			
		}
		
				
		

	}

}
