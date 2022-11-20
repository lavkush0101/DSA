package Lecture16;

import java.util.Scanner;

public class CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str= "abcd";		

	}
	
	public static void printString (String str) {
		int count=0;
		boolean [] visited = new boolean[str.length()];
		for (int len = 0; len <=str.length(); len++) {
			for (int si = 0; si <=str.length()-len; si++) {
				int ei=si+len;
				String s=str.substring(si,ei);
				if(isCbNumber(Long.parseLong(s)) ==true && isVisited(visited,si,ei-1)){
					count++;
					for (int i = si; i <ei-1; i++) {
						visited[i]= true;
					}
				}
			}
			
		}
	}
	
	public static boolean isCbNumber(long n) {
		int [] arr= {2,3,5,5,7,11,13,17,19,23,29};
		if(n==0 || n==1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[])
		}
	}
	
	public static isVisited(boolean [] visited ,int si, int ei) {
		
		for (int i = si; i < visited.length; i++) {
			if(arr[])
		}
	}

}
