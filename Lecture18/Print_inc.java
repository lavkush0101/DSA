package Lecture18;

public class Print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
        printNum(n);
	}

	// print the increasing the no 
	public static void printNum(int n) {
		if(n==0) {
			return ;
		}
	    printNum(n-1);
	    System.out.println(n);
	   
	}
}
