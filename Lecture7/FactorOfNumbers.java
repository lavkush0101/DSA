package Lecture7;

import java.util.Scanner;

public class FactorOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		
		System.out.println(factNo(n));
		
		
	}
	
	
		private static boolean primeno(int n) {
				
			int i=2;
			int fact=0;
			while(i<=n-1) {
				// check fact of number 
				if(n%i==0) {
					fact++;
				}
				i++;
			}
			// if fact is grater than 1 then no is not prime 
			if(fact>=1) {
				return false;	
			}else {
				return true;
			}
	
		}
	
	
		private  static int factNo(int n) {
			int ans =0;
			int i=2;
			while(i<=n) {
			  	     int rem = n%i;
			  	     if(rem ==0) {
			  	    	 System.out.println(i);
				  		ans=ans+i;
				  		n=n/i;
				  	}else {
				  		i++;
				  	}
			}
			return  ans;
		}

}
