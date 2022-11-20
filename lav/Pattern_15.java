package lav;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row =1;
		int star=n;
		int space=0;
		
		while(row<n+n) {
			// space
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
			if(row<=n) {
				space+=2;
				star--;
			}else {
				space-=2;
				star++;
			}
			
		}
	}
}
