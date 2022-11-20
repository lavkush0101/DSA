package lav;

import java.util.Scanner;

public class Patter_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row=1;
		int numStar=1;
		while(row<=2*n) {
			// star number
			int i=1;
			while(i<=numStar) {
				if(i==numStar) {
				   System.out.print(numStar+" " +" "	);
				}else {
					System.out.print(numStar+" " +"* "	);
				}
				i++;
			}
			// row
			// for the mirror 
			System.out.println();
			if(row<n) {
				numStar++;
			}else {
				numStar--;
			}
			row++;
		}
		

	}

}
