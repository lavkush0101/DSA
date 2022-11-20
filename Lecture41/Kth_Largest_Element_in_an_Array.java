package Lecture41;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {2,4,23,5,2,57,7,3,29};
		int k=1;
		int value=Kth_Largest(arr, k);
		System.out.println(value);
		

	}
	
	public static int Kth_Largest(int [] arr,int k){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		
	   for (int i = 0; i < arr.length; i++) {
		   if(pq.peek()<arr[i]) {
			   pq.remove();
			   pq.add(arr[i]);
		   }
	   }
	   return pq.peek();
	}
}
