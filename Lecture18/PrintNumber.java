package Lecture18;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		printNum(n);
	}

	// print the no decreasing order 
	
	
	public static void printNum(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
	    printNum(n-1);
	   
	}
	
	

}
