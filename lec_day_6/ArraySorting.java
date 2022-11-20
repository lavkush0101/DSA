package lec_day_6;

import java.util.Iterator;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int []a= {5,3,4,6,2,4};
	int []b= {3,2,4,1,2,2};
	
	
	// compare the data arrays
	
	for(int i=0; i<a.length ; i++) {
		 for(int j=0; j<b.length; j++) {
			 
//			   if(a[i]>a[j]) {
//				   int t[]=a;
				   a[i]=b[j];
				   b[j]=a[i];
				   System.out.print(a[j]+"  \n  "+b[i]+"  ..");
//			   }
			 
//			 	System.out.print(" "+a[j]);
				 
			 }
		 System.out.println();
		 }
	}
	
}
