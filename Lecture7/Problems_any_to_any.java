package Lecture7;

import java.util.Scanner;

public class Problems_any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =new Scanner(System.in);
		int s=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		System.out.println(dec_to_any(s, d, n));
		
	}
	
	public static  int dec_to_any(int s,int d,int n ) {
		int num=any_to_dec(s, n);
		int ans=0;
		int mul=1;
		while(num!=0) {
			int rem= num%d;
			ans =ans+rem*mul;
			num=num/d;
			mul*=10;
		}
		return ans;

	}

	
	public static  int any_to_dec(int s,int n ) {
		int ans=0;
		int mul=1;
		while(n!=0) {
			int rem= n%10;
			ans =ans+rem*mul;
			n=n/10;
			mul*=s;
		}
		return ans;
		
	}
	
	

}
