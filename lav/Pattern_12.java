package lav;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int row=1;
		int star =1;
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
			while(j<=star) {
				if(j%2==0) {
				  System.out.print("! ");
				}else {
					System.out.print("* ");
				}
				j++;
			}
			//row
			
			System.out.println();
			row++;
			space--;
			star+=2;
			
		}
	}

}
