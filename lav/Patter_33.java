package lav;

import java.util.Scanner;

public class Patter_33 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.close();
			
			int row=1;
			int star=1;
			int space=n-1;
			
			
			while(row<=n) {
				
				// space
				
				int i=1;
				while(i<=space) {
					System.out.print("\t");
					i++;
				}
				
				// star
				
				int j=1;
				int last=n;
				while(j<=star) {
					
					if(j==star/2+1) {
						System.out.print("0\t");
					}else {
						if(j<star/2+1) {
							   int c=j+space;
							   System.out.print(c+"\t");
							}else {
								  last--;
								  System.out.print(last+"\t");
								}
					}
					j++;
				}
				
				//row
				
				System.out.println();
				row++;
				star+=2;
				space--;
				
					
				
			}
			
		}

	}
