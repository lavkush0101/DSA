package Lecture41;

import java.util.PriorityQueue;

public class Min_Sum_Pair {

	public static void main(String[] args) {
		
		int [] arr= {2,3,4,2,5,2,6,3,7,22,5,88,24};
		

	}
	public static int minimum(int [] arr){
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum=0;
		while(pq.size()>1) {
			int a=pq.poll();
			int b=pq.poll();
			sum=sum+a+b;
			pq.add(a+b);
			
		}
	}
}
