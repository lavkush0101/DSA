package lav;

import java.util.Scanner;

public class Patter_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int row =1;
		int star =n;
		while(row<=n) {
			int i=1;
			while(i<=star){
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star--;
			
		}
	}

}
