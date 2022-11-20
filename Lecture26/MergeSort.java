package Lecture26;

public class MergeSort {

	public static void main(String[] args) {
		
		int [] arr = {3,2,1,6,7,-3,5};
		int [] ans=Merege_sort(arr,0, arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
			
		
	}
	public static int [] Merege_sort(int [] arr,int si,int e1){
		if(si==e1) {
			int bs[]=new int[1];
			bs[0]=arr[si];
			return bs;
		}
		
		int mid=(si+e1)/2;
		int [] fs=Merege_sort(arr, si, mid);
		int [] ss=Merege_sort(arr, mid+1, e1);
		return MergeTwoArray(fs, ss);
		
	}
	public static int [] MergeTwoArray(int [] arr,int [] brr) {
		
		int n=arr.length;
		int m=brr.length;
		int [] ans=new int[n+m];
		int i=0,j=0, k=0;
		while(i<n && j<m) {
			if(arr[i]<=brr[j]) {
				ans[k]=arr[i];
				i++;
				k++;
			}else {
				ans[k]=brr[j];
				j++;
				k++;
			}
		}
		
		while(i<n) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		while(i<m) {
			ans[k]=brr[i];
			i++;
			k++;
		}
		return ans;
				
	}

}
