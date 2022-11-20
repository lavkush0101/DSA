package lav;

import java.util.Scanner;

public class Patter_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row =1;
		int star=1;
		int space=n-1;
	
		while(row<=n+n-1) {
			// space 
			
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			
			// row
			
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			// row 
			
			System.out.println();
			
			if(row<n) {
				space--;
				star++;
			}else {
				space++;
				star--;
			}
			row++;
			
		}

	}

}
