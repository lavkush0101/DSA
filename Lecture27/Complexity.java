package Lecture27;

public class Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder  s=new StringBuilder();
		System.out.println(s.capacity());
		s.append("hellohellohelloh777");
		s.append("bb");
		System.out.println(s.length());
		System.out.println(s.capacity());
	}

}
