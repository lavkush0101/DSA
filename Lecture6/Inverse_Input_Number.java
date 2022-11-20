package Lecture6;

import java.util.Scanner;

public class Inverse_Input_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int ans =0;
		int p=1;
		while(n!=0) {
			int rem=n%10;
			ans=(int)(ans+ p*Math.pow(10, rem-1)); 
			n=n/10;
			p++;
			
		}
		System.out.println(ans);
		
	}

}
