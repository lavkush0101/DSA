package day_4_assigment_1;

import java.util.Scanner;

public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        int row=1;
        int star=1;
        int space=2*n-3;

        while(row<=n){

            // star
            int i= 1;
            while(i<=star){
                System.out.print(i+" ");
                i++;
            }
            
            // space
            
            int j=1;
            while(j<=space) {
            	 System.out.print("  ");
                 j++;
            }
            
            // star
            int k=1;
            int num=star;
            if(star>=n) {
            	num--;
            	star--;
            }
            while(k<=star){
	                System.out.print(num+" ");
	                num--;
	                k++;
            }
            // row
            star++;
            space-=2;
            System.out.println();
            row++;
        }

	}

}
