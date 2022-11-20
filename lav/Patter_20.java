package lav;

import java.util.Scanner;

public class Patter_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int star=1;
		int space= n/2;
		
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
				if(j==1||j==star) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				j++;
			}
			
			//row
			
			
			
			if(row<n/2+1) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
			System.out.println();
			row++;
			
			
		}
		
		
	}

}
