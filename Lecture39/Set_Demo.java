package Lecture39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<>();
		set.add("kartik");
		set.add("kamlesh");
		set.add("kunal");
		set.add("Lovekush");
		set.add("kapil");
		set.add("aman");
	
		System.out.println(set);
		// check 
		System.out.println(set.contains("shu"));
		System.out.println(set.contains("aman"));
		System.out.println(set.remove("aman"));
		System.out.println(set);
		
		
		//Treeset
		

		TreeSet<String> set2=new TreeSet<>();
		set2.add("kartik");
		set2.add("kamlesh");
		set2.add("kunal");
		set2.add("Lovekush");
		set2.add("kapil");
		set2.add("Aman");
		System.out.println(set2);
		
		// 
		LinkedHashSet<String> set3=new LinkedHashSet<>();
		set3.add("kartik");
		set3.add("kamlesh");
		set3.add("kunal");
		set3.add("Lovekush");
		set3.add("kapil");
		set3.add("Aman");
		System.out.println(set3);
	}

}
