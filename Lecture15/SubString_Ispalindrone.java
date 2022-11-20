package Lecture15;

public class SubString_Ispalindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // check the sub string are palindrone  or not 
		String str  ="nitin";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String s = str.substring(i,j);
				if(palindrdrone(s) ==true){
					System.out.println(s);
				}
			}
		}
		
	}
	
	
	public static boolean palindrdrone(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

}
