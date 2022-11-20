package Lecture40;

import java.util.Iterator;

public class Genrics_Demo {

	public static void main(String[] args) {
		
		Integer [] arr= {11,1,23,78,678};
		display(arr);
		
		
		
	}
	public static <T> display(T [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}   
