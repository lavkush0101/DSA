package Lecture6;

import java.util.Scanner;

public class Decimal_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
//		int n=179;
		int mul =1;
		int ans =0;
		while(n!=0) {
			int rem =n%8;
			ans =ans+rem*mul;
			n/=8;
			mul*=10;
		}
		System.out.println(ans);
	}

}
