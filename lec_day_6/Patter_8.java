package lec_day_6;

import java.util.Scanner;

public class Patter_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int star=5;
		int space=0;
		while(row<=n) {
		
			// space
			
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// star
			int i=1;
			while(i<=star) {
				if(i==1||i==star) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				i++;
			}
			// row
			System.out.println();
			if(row<n/2+1) {
				space++;
				star-=2;
			}else {
				space--;
				star+=2;
			}
			row++;
			
		}
	}

}
