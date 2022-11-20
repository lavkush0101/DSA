package Lecture14;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] arr = {9,2,4,3,6,5,4,2,1};
		permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void permutation(int [] arr) {
		int p=0;
		int n=arr.length;
		for (int i = n-2; i >=0; i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		
		//
		
		int q=0;
		for (int i = n-1; i>p; i--) {  // save the current index of value save 
			
			if(arr[i] >arr[p]) {
				q=i;
				break;
			}
		}
		
		//
		
		if (p == 0 && q == 0) {
			Revrse(arr, 0, n - 1);
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Revrse(arr, p + 1, n - 1);
	}
	
	public static void Revrse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
