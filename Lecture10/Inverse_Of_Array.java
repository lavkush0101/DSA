package Lecture10;

import java.util.Scanner;

public class Inverse_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int i=0;
		int [] arr= new int[n];
		
		while(i<n) {
			arr[i]=sc.nextInt();
			i++;
		}
		inverseArray(arr);
		
		for(int j=0 ; j<arr.length ; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void inverseArray(int [] arr) {
		int i=1;
		int j=arr.length-1;
		while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
		}
	}

}
