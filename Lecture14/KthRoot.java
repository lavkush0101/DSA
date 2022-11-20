package Lecture14;

import java.util.Scanner;

public class KthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			int t= sc.nextInt();
			
			while(t--> 0) {
				long n= sc.nextLong();
				int k=sc.nextInt();
				System.out.println(kthRoots(n, k));
			}
	}

	
	public static long kthRoots(long n , int k) {
		
		long ans =0;
		long lo=1;
		long hi=n;
		
		while(lo<=hi) {
			long x= lo+(hi-lo)/2;
			if(Math.pow(x, k)<=n) {
				ans=x;
				lo=x+1;
			}else {
				hi=x-1;
			}
			
		}
		return ans;
	}
}
