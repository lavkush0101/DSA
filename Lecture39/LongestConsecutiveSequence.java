package Lecture39;

import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[] = {2,4,5,7,8,1,3,9,11,10,16,15,15,1};
		
		
	}
	 public int longestConsecutive(int[] arr) {
	        
		 HashMap<Integer, Boolean> map=new HashMap<>();
		 for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i], false);
			}else {
				map.put(arr[i], true);
			}
			
			if(map)
		}
	   }
}
