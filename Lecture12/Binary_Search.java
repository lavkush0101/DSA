package Lecture12;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] arr = {2,3,5,6,7,8,12,13,15,16,18,19,20};
//		int item=7;
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int target=sc.nextInt();
		
		System.out.println(BineraySearch(arr, target));
		

	}
	
	public static int BineraySearch(int [] arr,int target) {
			int low=0;
			int hi=arr.length-1;
			while(low<=hi) {
//				int mid= (low+hi)/2;
				int mid=low+(hi-low)/2;

				if(arr[mid]== target){
					return mid;  // mid 
					
				}else if (arr[mid]<target) {
					low = mid+1;  //low
					
				}else {
					hi = mid-1;  // high
				}
			}
		return -1;	
	}

}
