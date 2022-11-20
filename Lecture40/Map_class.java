package Lecture40;

public class Map_class {

	public static void main(String[] args) {
		HashMap hash= new HashMap();
		hash.put("Raj", 198);
		hash.put("Aman", 298);
		hash.put("Lav", 398);
		hash.put("Kush", 598);
		hash.put("Lucky", 398);
		hash.put("Sonu", -98);
		
		System.out.println(hash.get("Raj", 0));
		System.out.println(hash);
	}

}
