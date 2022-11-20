package day_4_assigment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SampleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

        int sum = 0;

        while(sum>=0){
            int n = sc.nextInt();

            sum+=n;

            if(sum>=0)
            System.out.println(n);
            
        } 

	}

}
