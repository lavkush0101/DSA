package lav;

import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row=1;
		int star=1;
		int space=n-1;
		
		while(row<=n) {
			// space
			
		   int i=1; 
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j=1;
			int val =row;
			while(j<=star) {
				if(star==j || j==1 ) {
				 System.out.print(val+" ");
				
				}else {
					
				  System.out.print("0 ");	
				
				}
				j++;
			}	
			// row
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}

}
