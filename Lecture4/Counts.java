package Lecture4;

import java.util.Scanner;

public class Counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        sc.close();
	        int last=0;
	        int count=0;
	       
	        while(n!=0){
	            int rem=n%10;
	            last=rem;
	            while(n!=0) {
	            	int nrem=n%10;
	            	 n=n/10;
	            	if(last==nrem && last>1) {
	            		count++;
	            	}
	            }
	            n=n/10 ;
	        }
	        System.out.println(count);
	}
}
