package Lecture4;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divisor=36;
		int divident =60;
		
		while(divident%divisor!=0) {
			
			int rem =divident%divisor;
			divident=divisor;// first update the divident value
			divisor=rem;  // second update the divisor value 
				
		}
		// print the GCD
		System.out.println(divisor+"   is divisor.");
		

	}

}
