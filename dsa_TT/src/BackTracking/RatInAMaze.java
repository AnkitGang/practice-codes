package BackTracking;


public class RatInAMaze {
	//Need to check Block Area
	
	static boolean isNotBlocked(int[][] board, int row, int col) {
		if(row < board.length && col < board.length && board[row][col] == 1) {
			return true;
		}
		
		return false;
	}
	
	static boolean ratInAMaze(int[][] board, int row, int col, int[][] path) {
		if(row == board.length - 1 && col == board.length - 1) {
			path[row][col] = 1;
			return true;
		}
		
		if(isNotBlocked(board, row, col)) {
			path[row][col] = 1;
			
			//Move to next row and next col
			if(ratInAMaze(board, row + 1, col, path))
				return true;	
			
			if(ratInAMaze(board, row, col + 1, path))
				return true;
			
			//Undo the changes
			path[row][col] = 0;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] board = {
				{1, 0, 1, 0, 1},
				{1, 1, 1, 1, 1},
				{0, 1, 0, 1, 0},
				{1, 0, 0, 1, 1},
				{1, 1, 1, 0, 1}
		};
		
		int[][] path = new int[board.length][board.length];
		boolean result = ratInAMaze(board, 0, 0, path);
		
		if(result) {
			System.out.println("Rat Reach and Path Followed...");
			for(int i=0; i<path.length; i++) {
				for(int j=0; j<path[i].length; j++)
					System.out.print(path[i][j] + " ");
			
				System.out.println();
			}
		}
		else {
			System.out.println("Rat Not Reached...");
		}
	}
}
