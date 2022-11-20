package Lecture8;

public class Arrays_swap_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,50};
		int [] others= {100,200,300,400,500};
		
		System.out.println(arr[0]+ "");
		swap3(arr,others);
		System.out.println(arr[0]+"   "+ others[0]);
		

	}
	
	public static void swap3(int []arr, int [] others) {
		
		int [] t=arr;
		arr=others;
		others=t;
	}

}
