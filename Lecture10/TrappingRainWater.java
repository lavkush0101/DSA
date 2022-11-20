package Lecture10;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n != 0) {
			int s = sc.nextInt();
			int[] a = new int[s];
			int k = 0;
			while (k < s) {
				int input = sc.nextInt();
				a[k] = input;
				k++;
			}
			System.out.println(Trapping_(a));
			n--;

		}
	}

	public static int Trapping_(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = arr[0];
		right[n - 1] = arr[n - 1];
		for (int i = 1; i < right.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);

		}

		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);

		}

		int sum = 0;

		for (int i = 0; i < right.length; i++) {
			sum = sum + (Math.min(left[i], right[i]) - arr[i]);

		}
		return sum;
	}

}
