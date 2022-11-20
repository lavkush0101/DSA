package Lecture18;

public class TailRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// immediate return in tail
	 int n=5;fact
	 System.out.println(fact(n, 1));
	}
	
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans; // base case
		}
		return fact(n-1,ans*n);
			
		
	}

}
