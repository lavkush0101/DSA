package Lecture29;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.initCallData();
		s.age=34;
		s.name="lavkush bhai";
		
		s.initCallData();
	}

}





class Student{
	
	String name="lavkush";
	int age=24;
	
	public void initCallData() {
		System.out.println("My name is " + name +"  and age is "+age);
	}
}