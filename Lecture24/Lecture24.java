package Lecture24;

public class Lecture24 {

	public static void main(String[] args) {
	
		int [][] arr=new int[5][4];
		printAllPath(arr, 0, 0);
	}
	
	public static void printAllPath(int [][] visited,int cc, int cr) {
		
		if(cc==visited[0].length-1 && cc==visited.length-1) {
			visited[cr][cc]=1;
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j < visited[0].length; j++) {
					System.out.print(visited[i][j]+ " ");
				}
				System.out.println();
				visited[cr][cc]=0;
				System.out.println("**********");
			}
		}
		
		if(cc<0 || cr<0|| cc>=visited[0].length || cr>=visited.length || visited[cr][cc]==1) {
			return;
		}
		visited[cr][cc]=1;
		printAllPath(visited, cc+1, cr);
		printAllPath(visited, cc, cr+1);
		printAllPath(visited, cc-1, cr);
		printAllPath(visited, cc, cr-1);
		visited[cr][cc]=0;
	}

}
