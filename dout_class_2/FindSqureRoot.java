package dout_class_2;

import java.util.Scanner;

public class FindSqureRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		long n = sc.nextLong();
	
		System.out.println(kthRoots(n));
	
	}

	public static long kthRoots(long n) {

		long ans = 0;
		long lo = 1;
		long hi = n;

		while (lo <= hi) {
			long x = lo + (hi - lo) / 2;
			if (Math.pow(x, 2) <= n) {
				ans = x;
				lo = x + 1;
			} else {
				hi = x - 1;
			}

		}
		return ans;
	}

}
