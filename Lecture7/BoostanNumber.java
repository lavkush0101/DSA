package Lecture7;

import java.util.Scanner;

public class BoostanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		int c=factNo(n);
		System.out.println(c);
	}
	
	private  static int factNo(int n) {
		int sumdigit=digitsum(n);
		int ans =0;
		int i=2;
		while(i<=n) {
		  	     int rem = n%i;
		  	     if(rem ==0) 
		  	     {
			  	    if(primeno(i)) {
			  	    	
				  		ans=ans+digitsum(i);
				  		n=n/i;
			  	    }
			  	}else {
			  		i++;
			  	}
		}
		
		if(sumdigit==ans) {
			return 1;
		}else {
		   return 0;
		}
		
	}
	
	private  static int digitsum(int n) {
		
		int sum=0;
		int i=0;
		while(i<=4) {
			
			  	int rem = n%10;
			  	sum =sum +rem;
			  	n=n/10;
			
		  	    i++;
		}
		return  sum;
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
}
