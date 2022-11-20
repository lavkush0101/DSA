package Lecture12;

public class Insertions_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this example school student row

		int [] arr = {2,1,3,6,7,5};
		sortArr(arr);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public static void sortArr(int [] arr) {
		
		for(int i=1; i<arr.length; i++) {
			
			int j=i-1;
			int item =arr[i];
			
			while(j>=0 && arr[j]>item) {  
				  arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
	}

}
