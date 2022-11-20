package Lecture3;
//
//import java.util.Scanner;
//
//public class L_Pattern_27 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc= new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.close();
//		
//		int row =1;
//		int star=1;
//		int 
//		
//		
//
//	}
//
//}

import java.util.*;
public class L_Pattern_27 {
    public static void main(String args[]) {
        // Your Code Here

           	Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
            if(n>0){
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
                }
            }
	         
	       
	    }


	    private static int search(int []arr, int s){
	
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]==s){
	                return i;
	            }else{
                    return -1;
                }
	        }
			return s;
	        
	    }
}
