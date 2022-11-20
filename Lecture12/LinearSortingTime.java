package Lecture12;

import java.util.Scanner;

public class LinearSortingTime {

	    public static void main (String args[]) {

	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();

	        int [] arr = new int[n];

	        for(int i=0 ;  i<n; i++){
	            arr[i]=sc.nextInt();
	        }

	        int []ans= linearSort(arr);
	        for(int i=0; i<ans.length; i++){
	            System.out.print(ans[i]+" ");
	        }

	    }

	    public static int[] linearSort(int [] arr){
	    	int n=arr.length;
			for (int pass = 0; pass < n-1; pass++) {
				
				for (int i = 0; i<n-pass-1 ; i++) {  /// check the pass second loop use the check the  pass 
					if(arr[i]>arr[i+1]) {
						int t =arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=t;
					}
				}
				
			}

	        return arr;

	    }
	

}
