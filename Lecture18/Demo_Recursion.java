package Lecture18;

public class Demo_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));
	}
	
	// head recursion 
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int fn=fact(n-1);
		return n*fn;
	}

	
	//
}
