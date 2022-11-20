package Lecture10;

import java.util.Scanner;

public class Selection_Sort {
	
	public static void main(String[] args) {
		
//		int [] arr = {3,9, 6,-9,11};
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr= new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int []ans =sort(arr);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+"  ");
		}
	}
	
	private static int[] sort(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			int min =i;// store the track of index value 
			// min index  first find the index because when find the index then easilty replace to arrays values
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {// when find the minimum value the replace the value
					min =j;
				}
			}
			  
			// swapping  
			
			int t=arr[i];
			arr[i]=arr[min];
			arr[min]=t;
		}
		
		return arr;
	}
	
	

}
