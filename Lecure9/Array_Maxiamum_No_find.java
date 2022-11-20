package Lecure9;

public class Array_Maxiamum_No_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {2,3,8,11,5,6};
		
//		System.out.println("MAximum no value :- > . "+maximum(arr));
		
		System.out.println("MAximum no value :- > . "+Max1(arr));
	}

	private static int maximum(int [] arr) {
		
		int m=arr[0];
		 for (int i=1 ; i<arr.length; i++) {
				 if(arr[i]>m) {
					 m=arr[i];
				 }
				 
				 System.out.print(arr[i]+" ");
		 }
		
		return m;
	}
	private static int Max1(int [] arr) {
			
			int m=Integer.MIN_VALUE; // -2^31
			 for (int i=1 ; i<arr.length; i++) {
						 m=Math.max(m,arr[i]);	 
					 System.out.print(arr[i]+" ");
			 }
			return m;
		}
	
	
	

}
