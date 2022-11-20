package Lecture33;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		l.addfirst(10);
		l.addfirst(20);
		l.addfirst(30);
		l.addfirst(40);
		l.addfirst(50);
		l.display();
		l.addfirst(60);
		l.display();
	}
}
