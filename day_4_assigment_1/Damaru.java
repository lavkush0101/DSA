package day_4_assigment_1;

import java.util.Scanner;

public class Damaru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		int row=1;
		int star=2*n+1;
		int space=0;
		int val=n;
		
		while(row<=2*n+1) {
			
			// space
			
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			// star
			int j=1;
			int num=val;
			while(j<=star) {
				
				System.out.print(num+" ");
				
				if(j<=star/2) {// mirror
					num--;
				}else {
					num++;
				}
				j++;
			}
			
			//row
			
			if(row<n+1) {
				space++;
				star-=2;
				val--;
			}else {
				space--;
				star+=2;
				val++;
			}
			
			System.out.println();
			row++;
			
			
			
		}
		
		
		
	}

}
