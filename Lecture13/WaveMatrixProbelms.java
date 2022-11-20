package Lecture13;
public class WaveMatrixProbelms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int m =sc.nextInt();
		
//		int [][] arr = new int [m][n];  for user input 
		
		int [][] arr = {{10,20,30,40,50}, // hard coded input 
				{60,70,80,90,100},
				{2,4,6,8,10},
				{3,5,7,9,11}};
//		for (int i = 0; i < arr.length; i++) {  // for user input 
//				for (int j = 0; j < arr[0].length; j++) {
//						arr[i][j]= sc.nextInt();
//				}
//		}
		Display(arr);	
	}

	private static void Display(int[][] arr) {
		
		
		for (int col = 0; col < arr[0].length; col++) {
			
			if(col%2 ==0) {
				for (int row = 0; row < arr.length; row++) {
					
					System.out.print( arr[row][col] + " ");
				}
			}else {
				for (int row = arr.length-1; row >=0; row--) {

					System.out.print( arr[row][col]+" ");
				}
			}
		}
		
	}

}
