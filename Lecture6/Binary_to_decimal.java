package Lecture6;

public class Binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10110011;
		int mul =1;
		int ans =0;
		
		while(n!=0) {
			int rem =n%10;
			ans =ans+rem*mul;
			n/=10;
			mul*=2;
		}
		System.out.println(ans);
	}

}
