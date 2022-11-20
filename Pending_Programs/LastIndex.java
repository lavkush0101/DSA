package Pending_Programs;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inputvalue=sc.nextInt();
		int arr[]=new int[inputvalue];
		int i=0;
		while(i<arr.length) {
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println("********************************");
		int searchValue=sc.nextInt();
		System.out.println("********************************");
		
		printLastIndex(arr,searchValue,0);
		
	}
	public static void printLastIndex(int[] arr, int searchValue,int lastIndex) {
		
		
		if(arr[lastIndex]==searchValue) {
			
			System.out.println(lastIndex);
			return;
		}
		for (int i = arr.length; i<=0; i--) {
			if(arr[i]==searchValue) {
				printLastIndex(arr,searchValue,i);
			}
		}
	}
	

}
