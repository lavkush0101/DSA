package lav;

import java.util.Scanner;

public class Patter_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			// space
			
		   int i=1; 
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j=1;
			int val =1;
			while(j<=star) {
				System.out.print(val+" ");
				
				// mirror  star/2+1
				if(j<=star/2) {
				val++;
				}else {
					val--;
				}
				j++;
			}	
			// row
			System.out.println();
			row++;
			star+=2;
			space--;
		}
	}

}
