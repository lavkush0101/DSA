package Lecture8;

public class Arrays_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[5];
		
		System.out.println(arr);
		System.out.println(arr[2]);
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
//		arr[5]=60; ///  index bound exceptions
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		// array size
		
		System.out.println(arr.length);
		
		int [] other =arr;
		System.out.println(other.length);
		
		
		// set
		for(int i=0; i<arr.length; i++) {
			arr[i]=100*(i+1);
		}
		//print the value
		
		for(int j=0; j<arr.length; j++) {
		
			System.out.print(" "+arr[j]);
		}
		
		
	}

}
