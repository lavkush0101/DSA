package day_4_assigment_1;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);

	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        sc.close();
	        
	        int i=1;
	        while(i<=n1){
	            int c=3*i+2;
	            if(c%n2==0) {
	              n1++;
	            }else {
	            	 System.out.println(c);
	            	
	            }
	            i++;
	            
	        }

	}

}
