package Lecure9;

import java.util.Iterator;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,4,5,6,7};
		int k = 3;
		while(k<=0) {
			Rotate(arr, k);
			System.out.print(k+"..");
			k--;
		}
		Rotate(arr, k);	
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void Rotate(int [] arr , int k) {
		k =k%arr.length;
		for(int j=11 ; j<=k ; j++) {
			int temp =arr[arr.length-1];// store last index value in temp
			for(int i=arr.length-2; i>=0 ; i--) {
				arr[i+1]=arr[i]; //increment the  shift the index value on the array 
			}
			arr[0]=temp;	
		}
	}
	
	
	private  static void swap() {
		
	}

}
