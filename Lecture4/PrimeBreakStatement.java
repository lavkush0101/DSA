package Lecture4;

import java.util.Scanner;

public class PrimeBreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int i=2;
		int fact=0;
		
		while(i<n) {
			
			if(n%i==0) {
				fact++;
				break;
			}
			i++;
		}
		
		
		if(fact==1) {
			System.out.println(n+ " is not a prime.");
	     	
		}else {
			System.out.println(n+ "  is a prime .");
		}

	}

}
