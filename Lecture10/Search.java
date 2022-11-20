package Lecture10;

import java.util.Scanner;

public class Search {

	
	    public static void main(String args[]) {
	        // Your Code Here

	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        int [] arr = null;
	        // store the data on new array 
	        if(n>0) {
		        int i=0;
		        arr = new int[n];
		        while(i<n){
		            arr[i]=sc.nextInt();
		            i++;
		        }
		        int s =sc.nextInt();
		        sc.close();
		        System.out.println(search(arr,s));
	        }else {
	        	System.out.println("-1");
	        }
	         
	       
	    }


	    private static int search(int []arr, int s){
	        int index= 0;
	        for(int i=0; i<arr.length; i++){
	            if(s==arr[i]){
	                index=i;
	            }
	        }
	        return index;
	    }

}
