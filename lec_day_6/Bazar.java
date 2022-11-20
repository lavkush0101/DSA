package lec_day_6;

import java.util.Scanner;

public class Bazar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Scanner sc = new Scanner(System.in);
		        int t=sc.nextInt();
		        
		      while(t>0) {
			    int m=sc.nextInt(); // aayush
		        int n=sc.nextInt(); // harshit 
		        
		        int ayush_ph=0;
		        int harshit_ph=0;
	
		        int current =1;
		        while(true){
		            ayush_ph += current;
	
		            if(ayush_ph > m){
		                System.out.println("Harshit");
		                break;
		            }
		            
		            current++;
		            
		            harshit_ph += current;
		            if(harshit_ph > n) {
		            	System.out.println("Aayush");
		            	break;
		            }
		            current++;
		        }
		        t--;
	     }
	}

}
