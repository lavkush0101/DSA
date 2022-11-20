package Lecture3;

import java.util.Scanner;

public class Patter_rombous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int space=n-1;
		int star=1;
		int val=1;
		
		while(row<2*n-1) {
			
			// space 
			
			int i=1;
			
			while(i<=space) {
				
				System.out.print("\t");
				i++;
			}
			
			// star
			int j=1;
			int p=val;
			while(j<=star) {
				System.out.print(p+"\t");
				
				//mirror
				if(j<=star/2) {
					p++;
				}else {
				  p--;
				}
				j++;
				
			}
			
			
			// row 
			
			if(row<=n) {
				space--;
				star+=2;
				val++;
			}else {
				space++;
				star-=2;
				val--;
			}
			
			System.out.println();
			row++;
		}
				

	}

}
