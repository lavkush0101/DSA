package Lecure9;

public class Array_reverse {

	public static void main(String[] args) {
		
		int [] arr = {5,7,3,2,1,9};
		
		reversePrint(arr);
//		reverseArrayindexValue(arr);

	}

	// reverse the array
	private static void reversePrint(int[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(" "+arr[i]);
		}
	}
	
	
//	
	
	
	
}
