package dout_class;

import java.util.Scanner;

public class AlexShoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
        int q = sc.nextInt();
        
        while(q-->0) {
        	int a= sc.nextInt();
        	int k = sc.nextInt();
        	if(isPossibale(arr, a, k)==true ) {
        		System.out.println("Yes");
        	}else {
        		System.out.println("NO");
        	}
        	
        }
        
	}
	
	public static boolean isPossibale (int [] arr, int a, int k) {
		
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(a%arr[i]==0) {
				count++;
			}
			
		}
		
		return count>=k;
	}

}
