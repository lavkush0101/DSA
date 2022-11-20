package day_4_assigment_1;

import java.util.Scanner;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int star=1;
		
		int space=2*n-1;
		while(row<=2*n+1) {
			
			// star
			
			
			int num=n;
			int i=1;
			
			if(row==n+1) {
				i++;
				
			}
			
			while(i<=star) {
				System.out.print(num+" ");
				num--;				
				i++;
			}
			
			//space
			
			int j=1;
			
			
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			// star
			
			int k=1;
//		     num++;
		
			int s=num+1;
			if(star>n) {
				s--;
			}
			while(k<=star) {
					System.out.print(s+" ");
					s++;
					k++;
			}
			
			//row
			s=num+1;
			if(row<n+1) {
				star++;
				space-=2;
				
				
			}else {
				star--;
				space+=2;
				
			}
			
			System.out.println();
			row++;
			
			
			
		}
		

	}

}
