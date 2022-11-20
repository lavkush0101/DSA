package Lecture26;

public class Check_Prime_Opt {

	public static void main(String[] args) {
		
		int n=97;
		System.out.println(checkPrime(n));
		
	}

	public static boolean checkPrime(int n) {
		int i=2;
		while(i*i<=n) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
