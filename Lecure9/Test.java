package Lecure9;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int row=1;
		int star=1;
		int space=n-1;
		
		
		while(row<=2*n-1) {
			
			// space
			int i=0;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}	
			
			// star
			
			int j=0;
			while(j<star) {
//				if(j/2<star)
				System.out.print("* ");
				j++;
			}
			
			// row
			
			System.out.println();
			if(row<n) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
			
			row++;
			
		}
		

	}

}
