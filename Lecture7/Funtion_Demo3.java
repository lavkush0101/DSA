package Lecture7;

public class Funtion_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.out.println("Hey");
	  int c  =addition();
	  int d=add(5, 6);
	  System.out.println(d);
	  System.out.println("Bye");
	  System.out.println(addition());
	}
	
	
	public static int addition() {
		int a = 9;
		int b =6;
		int c=a+b;
		
		return c;
		
	}
	
	public static int add(int a, int b) {
		int c=a+b;
		return c;
		
	}

}
