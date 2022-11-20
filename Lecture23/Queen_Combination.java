package Lecture23;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [] board=new boolean[4];
		int tq=2;// sitting queen 
		printAnswer(board, tq, "", 0,0);
	}
	
	public static void printAnswer(boolean [] board, int tq,String ans,int qpsf,int index) {
		
		if(qpsf==tq) {
			System.out.println(ans);
			return ;
		}
		
		for (int i = index; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;

				printAnswer(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
				board[i]=false;
			}
		}
	}

}
