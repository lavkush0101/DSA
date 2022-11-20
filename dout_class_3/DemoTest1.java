package dout_class_3;

import java.util.Scanner;

public class DemoTest1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			printRose(arr, m);
		}

	}

	public static void printRose(int[] arr, int m) {
		int min = 0;
		int p = 0;
		int q = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				min = Math.abs(arr[i] - arr[j]);
				if (sum == m && min >= Math.abs(arr[i] - arr[j])) {
					p = i;
					q = j;
				}
			}
		}
//		
		if (arr[p] < arr[q]) {
			System.out.println("Deepak should buy roses whose prices are " + arr[p] + " and " + arr[q] + ".");
		} else {
			System.out.println("Deepak should buy roses whose prices are " + arr[q] + " and " + arr[p] + ".");
		}
	}
}
