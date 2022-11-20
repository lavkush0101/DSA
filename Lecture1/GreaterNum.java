package Lecture1;

public class GreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=89;
		int b=134;
		int c=95;
		
		if(a>b && a>c) {
			System.out.println(a+ "  is a Greater number");
		}else if (b>a&& b>c) {
			System.out.println(b +"  is a Greater number");
		}else {
			System.out.println(c+"  is a Greater number");
		}
	}

}
