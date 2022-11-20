package lav;

import java.util.Scanner;

public class Patter_22 {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int star=2*n;
		int space=0;
		
		while(row<=n) {
			
			// star
			int i=1;
			while(i<=star/2-3) {
				System.out.print("* ");
				i++;
			}
			
			// space
			
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			// star
			
			int k=1;
			while(k<=star/2-3) {
				k++;

//				if(row==n) {
//					k--;
//				}else {
//					k++;
//				}
				System.out.print("* ");
				
			}
			
			System.out.println();
			row++;
			star--;
			space++;
						
		}
		
	}
}
