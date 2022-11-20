package Lecure9;

public class ArrayDataReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,3,4,1,4,18,9,90,910,78};
//		Revrese(arr);
		reverseMid(arr, 1, 8);
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print(" "+arr[i]);
		}
		
		

	}
	
	
	
	// inner changes of array
	
	public static void Revrese(int [] arr) {
		
		int i=0;
		int j =arr.length-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		
	} 
	
	
	// 2  mid element only reverse
	
	public static void reverseMid(int [] arr , int i, int j) {
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		
	}

}
