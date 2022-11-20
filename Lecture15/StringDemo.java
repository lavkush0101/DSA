package Lecture15;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "hello";// pool
		 String str1="hello";
		 String str2 =new String("hello");  // new store in heap
		 System.out.println(str);
		 
		 int a =9;
		 int b=8;
		 System.out.println(a==b);
		 System.out.println(str==str2);
		 System.out.println(str==str1); // address compare karega 
		 
		 str= str +"bye";
		 str= "hello";  
		  // == compare the address 
		 // equals  address of value 
		 
		 // hardcoded value stored in string pool 
		 // note  new keyword , user input , add are always string store in outside of pool 
		 
		 System.out.println(str==str1);//address compare karega 
		 System.out.println(str1.equals(str2)); // content compare 
		 
		 // immutable  
	}
	
	

}
