package Lecture19;

public class Count_SubSuquence {

	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		
//		printsubsequnce(ques, "");
//		System.out.println("  "+count);
		System.out.println(countsubsequnce(ques, ""));
	
		

	}

	// using the static variable to count the string variable 
	public static void printsubsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}

		char ch = ques.charAt(0);
		printsubsequnce(ques.substring(1), ans);// no
		printsubsequnce(ques.substring(1), ans + ch);// yes

	}
	// second way count the subsuquence no without uaing the static varaiable 
	public static int  countsubsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return 	1;
		}
		char ch = ques.charAt(0);
		int l=countsubsequnce(ques.substring(1), ans);// no
		int r=countsubsequnce(ques.substring(1), ans + ch);// yes
		return l+r;
	}


}
