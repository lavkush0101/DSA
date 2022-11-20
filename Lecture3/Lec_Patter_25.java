package Lecture3;

public class Lec_Patter_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int n=7;
	int row=1;
	int star=row;
	int space=n-1;
	
	for(row=1; row<=n; row++) {
		
			// space
			
			for(int i=1; i<=space; i++) {
				System.out.print("  ");
				
			}
			
			// star
			
			for(int j=1; j<=star; j++) {
				
				System.out.print("* ");
			}
			
			
			// row
			
			System.out.println();
		
			star+=2;
		}

	}
}
