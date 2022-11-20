package Lecture23;

public class Queen_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board=new boolean[4];
		int tq=2;// siitiing queen 
		printAnswer(board, tq, "", 0);
		//tq total queen 

	}
	// qpsf -- queen place show for 
	
	public static void printAnswer(boolean [] board,int tq, String ans, int qpsf) {
		if(qpsf==tq) {
			System.out.println(ans);
			return ;
		}
		
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				
				printAnswer(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
				board[i]=false;
			}
		}
		
	}

}
