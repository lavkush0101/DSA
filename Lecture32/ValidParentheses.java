package Lecture32;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="(({}[]))";
		
		System.out.println(isValidParenttheses(str));

	}
	
	public static boolean isValidParenttheses(String str) {
		
		Stack<Character> st= new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				if(ch==')') {
					if(st.peek() =='(') {
						st.pop();
					}else {
						return false;
					}
				}
				if(ch=='{') {
					if(st.peek() =='}') {
						st.pop();
					}else {
						return false;
					}
				}
				if(ch=='[') {
					if(st.peek() ==']') {
						st.pop();
					}else {
						return false;
					}
				}
			}
		}
		return st.isEmpty();
	}

}
