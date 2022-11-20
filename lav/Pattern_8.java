package lav;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row=1;
		int star=n;
		while(row<=n) {
			// space
			
			// star
			int i=1;
			while(i<=star) {
				if(i==row   ) {
				   System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				i++;
			}	
			// row
			System.out.println();
			row++;
		}
	}
}
