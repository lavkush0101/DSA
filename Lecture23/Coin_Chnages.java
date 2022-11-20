package Lecture23;

public class Coin_Chnages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,3,4,5};
		int ammount =10;
		printAnswer(arr, ammount, "");
		
	}
	
	public static void printAnswer(int [] coin , int ammount ,String ans) {
		
		if(ammount ==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coin.length; i++) {
			
			if(ammount>=coin[i]) {
				printAnswer(coin,ammount - coin[i],ans+ coin[i]);
			}
		}
	}

}
