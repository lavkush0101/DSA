package Lecture26;

public class QuickSort {

	public static void main(String[] args) {
		int [] arr= {12,3,14,5,7,2,4,1,4};
		quickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void quickSort(int [] arr, int si, int ei) {
		 if(si>ei) {
			 return;
		 }
		
		int idx=partitons(arr, si, ei);
		quickSort(arr, si, idx-1);
		quickSort(arr, idx+1, ei);
		
	}
	
	public static int partitons(int [] arr,int si,int ei) {
		int pivot=arr[ei];
		int pos=si;
		for (int i = si; i < ei; i++) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
				pos++;
			}
		}
		
		int temp=arr[ei];
		arr[ei]=arr[pos];
		arr[pos]=temp;
		return pos;
		
		
	}

}
