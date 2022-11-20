package Lecture7;

import java.util.Scanner;

public class Problem_check_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sc.close();
		int armstrong_no=0;
		while(n1<=n2) {
			int c=CountArmStrongNo(n1);
				if(c==1) {	
					System.out.println(n1);
				armstrong_no++;
			}
			n1++;
		}		
	}
	
	public static int CountArmStrongNo(int n) {
		
		int totalArmgNo=0;
		int count=countDigit(n);
		int cod=n;
		int ans =0;
		while(n!=0) {
			
			int rem =n%10;
			ans=(int) (ans+Math.pow(rem, count));
			n=n/10;
		}
		if(ans==cod) {
			totalArmgNo++;
		}
		
		return totalArmgNo;
		
	}
	
	public static  int countDigit(int n){
		int count=0;
		while(n!=0) {
			int rem =n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}
