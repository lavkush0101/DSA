package Lecture39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("lav", 01);
		map.put("kush", 02);
		map.put("love", 03);
		map.put("bhai", 04);
		map.put(null, 07);
		
//		System.out.println(map);
		map.keySet();
		Set<String> set=map.keySet();
		for(String key:set) {
			System.out.println(key+ " "+map.get(key));
		}
		
		ArrayList<String> list=new ArrayList<>(map.keySet());
		for(String key:map.keySet()) {
		}
		
		
		//map.put("bhai", 8);
		//System.out.println(map);
		// containskey
		//System.out.println(map.containsKey("bhai"));
		
		// remove
		//System.out.println(map.remove("bhai"));
		//get the data using the key
		//System.out.println(map.get("bhai"));
//		System.out.println(map);
		
		//Get
		
		// TreeMap
		
		TreeMap<String,Integer> map1 = new TreeMap<>();
		map1.put("lav", 01);
		map1.put("kush", 02);
		map1.put("love", 03);
		map1.put("bhai", 04);
//		System.out.println(map1);
		
		// LinkedHashMap
		
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
		map2.put("lav", 01);
		map2.put("kush", 02);
		map2.put("love", 03);
		map2.put("bhai", 04);
		map2.put(null, null);
//		System.out.println(map2);
		
		
		//set 
		
		
	
	}
}
