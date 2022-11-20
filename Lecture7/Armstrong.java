package Lecture7;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(armStrong_Number(n));
		
	}
	
//	 return type 
	public static boolean armStrong_Number(int n) {
		int d=n;
		int cod=countDigit(n);
		int ans =0;
		while(n!=0) {
			int rem = n%10;
			ans = (int) (ans+Math.pow(rem, cod));
			n=n/10;
		}
		
		if(ans==d) {
			return true;
		}else {
			return false;
		}
		
	}

	//countDigit	
			
	private static int countDigit(int n) {
		int count=0;
			while(n!=0) {
				count++;
				n=n/10;
			}
		return count;
	}
		
		
}
