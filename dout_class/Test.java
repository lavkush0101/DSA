package dout_class;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int [] ans=Inverse(arr);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	
	public static int [] Inverse(int [] arr) {
		
		int [] brr = new int [arr.length];
		for (int i = 0; i < brr.length; i++) {
			brr[arr[i]]=i;
		}
		return brr;
	}

}
