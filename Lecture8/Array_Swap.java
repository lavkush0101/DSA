package Lecture8;

public class Array_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10, 20, 30, 40, 50};
		System.out.println(arr[0]+  "  "+arr[1]);
		swap(arr[0],arr[1]);
		System.out.println(arr[0]+"  "+arr[1]);
				

	}
	
	public static  void swap(int a , int b) {
		int t=a;
		a=b;
		b=t;
		System.out.println(a+"  "+b);
	}

}
