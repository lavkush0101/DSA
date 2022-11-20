package lav;

import java.util.Scanner;

public class Patter_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int space =n-1;
		int star=1;
		
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
				System.out.print(j+" ");
				j++;
			}
			
			// row
			
			System.out.println();
			row++;
			space--;
			star+=2;
			
			
		}
	}

}
