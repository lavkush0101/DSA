package day_4_assigment_1;

import java.util.Scanner;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		      1 
//        2 1   1 2 
//    3 2 1       1 2 3 
//4 3 2 1           1 2 3 4 
//    3 2 1       1 2 3 
//        2 1   1 2 
//            1 

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int star=1;
		int space=n-1;
		int nestSpace=-1;
		while(row<=n) {
			
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			// star
			int j=1;
			int num=star;

			while(j<=star) {
				System.out.print(num+" ");
				num--;
				j++;
			}
			
			// nested space
			
			int k=1;
			while(k<=nestSpace) {
				System.out.print("  ");
				k++;
			}
			
			// nested star
			
			int x=1;
			
			if(row==1||row==n) {
				x++;
			}
			
			
			while(x<=star) {
				System.out.print(x+" ");
				num++;
				x++;
			}
			
			System.out.println();
			if(row<=n/2) {
				space-=2;
				star++;
				nestSpace+=2;
			}else {
				 space+=2;
				 star--;
				 nestSpace-=2;
			}
			row++;
			
			
			
		}
	}

}
