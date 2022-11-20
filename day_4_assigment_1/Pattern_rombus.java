package day_4_assigment_1;

import java.util.Scanner;

public class Pattern_rombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int space=n-1;
		int star=1;
		int val=1;
		
		
		while(row<=2*n-1) {
			//space
			
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// star
			
			int j=1;
			int num=val;
			while(j<=star) {
				//
				 System.out.print(num+" ");
				if(j<=star/2  ) {
					num++;
				}else {
					num--;
				}
				j++;
			}
			
			//row'
			
			if(row<n) {
				space--;
				star+=2;
				val++;
			}else {
				star-=2;
				space++;
				val--;
				
			}
			row++;
			System.out.println();
		}
	}

}
