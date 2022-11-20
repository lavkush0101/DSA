package Lecture15;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Kashmira";
		String str1= "kunal";
		if(compareTo(str, str1)>0) {
			System.out.println(str);
		}else {
			System.out.println(str1);
		}
		
	}
	
	public static int compareTo(String s1, String s2) {
		
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)> s2.charAt(j)) {
				return s1.charAt(i)- s2.charAt(j);
			}else if(s1.charAt(i) < s2.charAt(j)){
				return s1.charAt(i) - s2.charAt(j);
			}
			i++;
			j++;
			
		}
		return s1.length()-s2.length();
	}

}
