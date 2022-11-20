package Lecture10;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] a= new int[n];
		int k=0;
		while(k<n) {
			int input = sc.nextInt();
			a[k]=input;
			k++;
			
		}
		
		long [] ans=productException(a);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	
	public static  long[] productException(int a[])
    {
        long left[]=new long[a.length];
        long right[]=new long[a.length];
        left[0]=1;
        right[a.length-1]=1;
        for(int i=1;i<left.length;i++)
        {
            left[i]=left[i-1]*a[i-1];
        }
        for(int i=a.length-2;i>=0;i--)
        {
            right[i]=right[i+1]*a[i+1];
        }
        long prod[]=new long[a.length];
        for(int i=0;i<prod.length;i++)
        {
            prod[i]=left[i]*right[i];
        }
        return prod;
    }

	
//	public static long [] productException(int [] arr) {
//		
//		long [] left = new long [arr.length];
//		long [] right = new long [arr.length];
//
//		left[0]=1;
//		
//		for (int i = 1; i < left.length; i++) {
//			left[i]=left[i-1]*arr[i-1];
//			
//		}
//		
//		right[right.length-1]=1;
//		
//		for (int i =  right.length-2; i>=0; i--) {
//			right[i]=right[i+1]*arr[i+1];
//					
//		}
//		
//		for (int i = 0; i < right.length; i++) {
//			arr[i]=(int) (left[i]*right[i]);
//		}
//		return arr;
//	}
}
