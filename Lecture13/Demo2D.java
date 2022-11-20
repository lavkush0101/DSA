package Lecture13;

public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int [4][3];
		
		System.out.println(arr[0]);
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				
				arr[i][j]=10*(i+j+1);
				
			}
		}
		
		
		// pritn
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[0].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
			
		}

	}

}
