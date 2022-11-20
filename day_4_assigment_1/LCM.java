package day_4_assigment_1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.close();
		
		int a=n1;
		int b=n2;
		int lcm=0;
		
		while(b%a!=0) {
			
			int rem =b%a;
			b=a;// first update the divident value
			a=rem;  // second update the divisor value 
				
		}
		// print the LCM
		
		lcm=(n1*n2)/a;
		System.out.println(lcm);
		
		
	}

}
