package dout_class;

import java.util.Scanner;

public class Maximum_Cir_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int []  arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(MaxiSum(arr));
	}
	
	public static int MaxiSum(int [] arr) {
		int ans=Integer.MIN_VALUE	;
		int curr=0;
		for (int i = 0; i < arr.length; i++) {
			curr=curr+arr[i];
			ans = Math.max(ans,curr);
			if(curr>0) {
				curr=0;
			}
		}
		return ans;
	}

}
