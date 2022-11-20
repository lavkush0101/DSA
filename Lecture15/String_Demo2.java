package Lecture15;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "hellobyehey";
				
//		String 
		System.out.println(str.charAt(7));  // find the index of the char
		System.out.println(str.length()); // size 
		
		String str1 ="vishal";
		String str2 = "vjpul"; 
		System.out.println(str1.compareTo(str2));
		if(str1.compareTo(str2)>0) { // compare the char dictionary order then print the greater order and also return positive value
			
		  System.out.println(str1);
		}else {
		   System.out.println(str2);
		}
		
	}

}
