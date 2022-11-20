package lec_day_6;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		
			while(t>0) {
				int n= sc.nextInt();
				int mul =1;
				int ans =0;
				
				while(n!=0) {
					int rem =n%10;
					ans =ans+rem*mul;
					n/=10;
					mul*=2;
				}
				System.out.println(ans);
			t--;
		}
	}
}
