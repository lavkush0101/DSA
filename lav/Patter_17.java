package lav;

import java.util.Scanner;

public class Patter_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row =1;
		int star=n/2;
		int space=1;
		
		while(row<=n) {
			
			// star
			
			int k=1;
			
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			// space
			
			  int i=1;
			  while(i<=space) {
				  
					  System.out.print("  ");
				  i++;
				
			  }
			//star
			  int j=1;
			  while(j<=star) {
					System.out.print("* ");
					j++;
				}
				
			// row
			  System.out.println();
			  
			  if(row<=n/2) {
				  space+=2;
				  star--;
			  }else {
				  space-=2;
				  star++;
			  }
			  
			  row++;
			
			
		}
			
	}

}
