package lav;

import java.util.Scanner;

public class Patter_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row =1;
		int star=1;
		
		
		while(row<=n+n) {
			//star 
			int i=1;
			while (i<star) {
				System.out.print("* ");
				i++;
			}
			//row
			System.out.println();
		
			// logic for print check the 
			if(row<=n) {
			  star++;
			}else {
				star--;
			}
			row++;
			
			
		}
	}
}
