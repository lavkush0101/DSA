package Lecture10;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 9, 6, -9, 11 };
		sort(arr);
		// this lopp is use for the pro=in the aop

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

	public static void sort(int[] arr) {
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
	}

}
