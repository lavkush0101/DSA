package Lecture4;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		int i=2;
		int fact=0;
		while(i<=n-1) {
			// check fact of number 
			if(n%i==0) {
				fact++;
			}
			i++;
		}
		// if fact is grater than 1 then no is not prime 
		if(fact>=1) {
			System.out.println(n+ " is not a prime.");	
		}else {
			System.out.println(n+ "  is a prime .");
		}
	}

}
