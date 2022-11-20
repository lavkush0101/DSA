package dout_class_2;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n > -100000000 && n < 100000000) {

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			int[] ans = sort(arr);

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + "  ");
			}
		}
	}

	public static int[] sort(int[] arr) {
		int n = arr.length;
		for (int pass = 0; pass < n - 1; pass++) {

			for (int i = 0; i < n - pass - 1; i++) { /// check the pass second loop use the check the pass
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			}

		}

		return arr;
	}
}
