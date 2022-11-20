package Lecture18;

public class PowerNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a=5;
		int b=3;
		System.out.println(powerCalculate(a, b));
	}
	
	public static int powerCalculate(int a, int b) {
		
		if(b==0) {
			return 1;
		}
	   int fn = powerCalculate(a,b-1);
		return a*fn;	   
		
	}

}
