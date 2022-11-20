package Lecture7;

import java.util.Scanner;

public class Check_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      sc.close();
      
      int j=2;
      while(j<=n) {
    	  if(primeNo(j)) {
    		  System.out.println(j);
    	  }
    	  j++;
      }

	}
	
	private static boolean primeNo(int n) {
		System.out.println("..."+n);
		int count=0;
		int i=2;
		while(i<=n-1) {
			if(n%i==0) {
				count++;
				System.out.println(".............."+i);

			}

			i++;
		}
		if(count>=1) {
			return false;
		}else {
			return true;
		}
	}

	
}
