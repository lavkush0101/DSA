package day_4_assigment_1;

import java.util.Scanner;

public class HolloDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int star=n;
		int space=-1;
		
		while(row<=2*n-1) {
			
			//star
			
			int i=1;
			if(row==1 || row==2*n) {
				  i++;
				}
			
			
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			
			// space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			
			// star
			
			int k=1;
			while(k<=star) {
				
				 System.out.print("*");
				
				k++;
			}
			
			
			// row
			
			row++;
			if(row<=n) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			System.out.println();
			
			
		}
				
			
		

	}

}
