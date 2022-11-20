package Lecture10;

import java.util.Scanner;

public class Sum_pairs_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int i=0;
		int [] arr =new int[n];
		while(i<n) {
			arr[i]=sc.nextInt();
			i++;
		}
		
		int t=sc.nextInt();
		createPairs(arr,t);
	}
	
	public static void createPairs(int [] arr, int t) {
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i]+arr[j]==t) {
					System.out.println(arr[i]+ " and "+arr[j]);
				}
			}
		}
		
	}

}



