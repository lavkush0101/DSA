package dout_class;

import java.util.Arrays;
import java.util.Scanner;

public class Dout_2_taget_sum_pairs {

		    public static void main(String args[]) {

		     	Scanner sc= new Scanner(System.in);
				int n= sc.nextInt();
				
				int i=0;
				int [] arr =new int[n];
				while(i<n) {
					arr[i]=sc.nextInt();
					i++;
				}
				
				int s=sc.nextInt();
		        Arrays.sort(arr);
		        calcluatePairs(arr,s);
		        
			}

		    public static void calcluatePairs(int [] arr,int target){
		    
		    int i=0;
		    int j=arr.length-1;
		    while(i<j){
		        int sum=arr[i]+arr[j];
		        if(sum>target){
		            j--;
		        }else if (sum <target){
		            i++;
		        }else{
		            System.out.println(arr[i]+ " and "+ arr[j]);
		        i++;
		        j--;
		        }
		    }
				
		    }
		

}
