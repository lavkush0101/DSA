package Lecture11;

public class SubArray_Sum {
	
	// credendce algo	rthi,

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int [] arr= {4,5,-3,-12,13,4};

		
		System.out.println(MaxiSum(arr));
		

	}
	
//	public static int  MaxiSum(int []arr) {
//		int ans=Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			int sum=0;
//			for (int j = i; j < arr.length; j++) {
//				sum=sum+arr[j];
//				ans =Math.max(ans,sum);
//			}
//					
//		}
//		return ans;
//		
//	}/
	
	public static int MaxiSum(int [] arr) {
		int ans=Integer.MIN_VALUE	;
		int curr=0;
		for (int i = 0; i < arr.length; i++) {
			curr=curr+arr[i];
			ans = Math.max(ans,curr);
			System.out.println(curr+"..."+ans);
			if(curr>0) {
				curr=0;
			}
		}
		return ans;
	}

}
