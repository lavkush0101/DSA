package Lecture7;

import java.util.Scanner;

public class Replace_0_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner sc= new Scanner(System.in);
			long n= sc.nextLong();
			sc.close();
			if(n==0) {
				 n=5;
				 System.out.println(n);
			}else {
				long c=replacevalue(n);
			   System.out.println(c);
			}
			
				
			
		}
	
	private static long  replacevalue(long n) {
		long ans = 0;
		int value=5;
		long mul=1;
		while(n != 0) {
			long rem =  (n % 10);
			if( rem == 0) {
				ans= (long)(ans+value*mul);
			}else {
				ans = (long)(ans+ rem*mul);
			}
			n = n/10;
			mul=mul*10;
		}
		return ans;
	}
		
//		private static int  replacevalue(int n) {
//			int revNum = reverse( n );
//			int ans = 0;
//			int value=5;
//			
//			while(revNum != 0) {
//				int rem = revNum % 10;
//				if( rem == 0) {
//					ans= ans*10+value;
//				}else {
//					ans = ans*10 + rem;
//				}
//				revNum = revNum/10;
//			}
//			return ans;
//		}
		
		
		
//		private static int reverse(int n) {
//			int rev = 0;
//			int value=5;
//			while(n != 0) {
//				int rem = n % 10;
//				if( rem == 0) {
//					rev= rev*10+ value;;
//				}else {
//					rev = rev*10 + rem;
//				}
//				n/=10;
//			}
//			return rev;
//			
//		}
}
