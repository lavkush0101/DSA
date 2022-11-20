package lav;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int space =n/2;
		int star=1;
		
		
		while(row<=n) {
			//space
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
			
			if(row<=n/2+1) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
			
			
		}
		
		
	}

}
