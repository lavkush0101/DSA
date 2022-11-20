package Lecture2;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int row=1;
		int space=0;
		int star =5;
		
		while(row<=n) {
			//space
//				int i=0;
//				while(i<=space) {
//					System.out.print("");
//					i++;
//				}
			
			//star
				int j=1;
				while(j<=star) {
					if(j==1 && j==n) {
					  System.out.print("* ");
					}
					j++;
				}

			//row
				System.out.println();
				row++;
//				space--;
//				star--;
		}

	}

}
