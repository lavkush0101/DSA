package lav;

public class Patter_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int row =1;
		while(row<=n) {
			
			// star
			int i=n;
			while(i>=1) {
				System.out.print("* ");
				i--;
			}
			row++;
			System.out.println();
		}
	}

}
