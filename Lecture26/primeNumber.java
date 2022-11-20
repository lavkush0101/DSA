package Lecture26;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			if(primeNo(i)) {
			 System.out.println(i);
			}
		}

	}
	
	private static boolean primeNo(int n) {
		int count=0;
		int i=2;
		while(i<=n-1) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count>=1) {
			return false;
		}else {
			return true;
		}
	}
}
