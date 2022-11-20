package lav;

import java.util.Scanner;

public class Patter_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		 
		 int row=1;
		 int space=n-1;
		 int num=1;
		 int k=1;
		 while(row<=n) {
			 
			 // space
			 int i=1;
			 while(i<=space) {
				 System.out.print("\t") ;
				 i++;
			 }
			 
			 // number print
			 
			 int j=1;
			 while(j<=num) {
				 System.out.print(k+"\t");
				 k++;
				 j++;
				 
			 }
			 
			 // row 
			 
			 System.out.println();
		
			 space--;
			 num+=2;
			 row++; 
		 }
	}

}
