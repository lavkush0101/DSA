package Lecture1;

import java.util.Scanner;

public class GradeCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Marks ");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		if(a>=75) {
			System.out.println("Marks is "+a+"  Grade A");
		}else if(a<75 && a>=65) {
		    System.out.println("Marks is "+a+"  Grade  B");
		}else if (a<65 && a>=55) {
			System.out.println("Marks is "+ a +" Grade C");
		}else if(a<55 && a>=45) {
			System.out.println("Marks is "+ a+ " Grade D" );
		}else if (a<45 && a>=30) {
			System.out.println("Marks is "+a  +"  Pass  ");
		}else {
			System.out.println("Marks is "+ a+"  Fails ");
		}

	}

}
