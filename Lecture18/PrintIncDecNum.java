package Lecture18;

public class PrintIncDecNum {
	
	
	public static void main(String[] args) {
		
		int n=5;
		
		printIncandDec(n);
		
	}
	
	public static void printIncandDec(int n) {
		
		if(n==0) {
			return ;
		}
		System.out.println(n);
		printIncandDec(n-1);
		System.out.println(n);
		
	}

}
