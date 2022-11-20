package Lecture15;

public class Plainedrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MOM";

		if (palindrdrone(str)) {

			System.out.println("String is plaindrone");

		} else {
			System.out.println("Not a plaindrone");
		}
	}

//	public static String checkPlaindrone(String str) {
//
//		String subString = "";
//		for (int n = str.length() - 1; n >= 0; n--) {
//			subString = subString + str.charAt(n);
//		}
//		return subString;
//	}

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
