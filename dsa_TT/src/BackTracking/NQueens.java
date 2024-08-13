package BackTracking;

public class NQueens {
	
	static boolean isQueenSafeOrNot(boolean board[][], int row, int col) {
		//Check-1 ....Checking on Above Row in same column
		for(int i = row; i >= 0; i--)
			if(board[i][col])  //There is a Queen
				return false;
		
		//Check-2....Left Diagonal Check
		for(int i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if(board[i][j])
				return false;
		
		//Check-3....Right Diagonal Check
		for(int i = row, j = col; i >= 0 && j < board[row].length; i--, j++)
			if(board[i][j])
				return false;
		
		return true;
	}
	
	static int countNumberOfWays(boolean board[][], int currRow) {
		int count = 0;
		
		if(currRow == board.length) {
			return 1; // 1 Possibility
		}
		
		//From the Row (Need to traverse each Column)
		for(int column = 0; column < board[currRow].length; column++) {
			//Place the queen on column but before placing check the queen is safe or not
			if(isQueenSafeOrNot(board, currRow, column)) {
				board[currRow][column] = true; // Placing the queen on board
				//After placing the queen , move to next row
				int result = countNumberOfWays(board, currRow + 1);
				count = count + result;
				//Stack fall backTracking
				board[currRow][column] = false;  //Undo the Option
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		final int N =7;
		boolean chessBoard[][] = new boolean[N][N];  //all values are filled with false
		System.out.println(countNumberOfWays(chessBoard, 0));
	}
}







//
//public class NQueens {
//	public static boolean isQueenSafe(boolean[][] board, int row, int col) {
//		for(int i=row; i>=0; i--)
//			if(board[i][col])
//				return false;
//		
//		for(int i=row, j=col; i>=0 && j>=0; i--, j--)
//			if(board[i][j])
//				return false;
//		
//		for(int i=row, j=col; i>=0 && j<board[row].length; i--, j++)
//			if(board[i][j])
//				return false;
//		
//		return true;
//	}
//
//    public static int solveNQueens(boolean [][] board, int currRow){
//    	int count = 0;
//    	
//    	if(currRow == board.length)
//    		return 1;
//    	
//    	for(int col = 0; col < board[currRow].length; col++) {
//    		if(isQueenSafe(board, currRow, col)) {
//    			board[currRow][col] = true;
//    			int result = solveNQueens(board, currRow + 1);
//    			count += result;
//    			board[currRow][col] = false;
//    		}
//    	}
//    	return count;
//    }
//
//    public static void main(String[] args) {
//    	final int N = 2;
//        boolean [][] board = new boolean[N][N];
//        System.out.println(solveNQueens(board, 0));
//    }
//}




//    <-------Leetcode Question------>
//
//class MySolution{
//    static List<List<String>> res = new ArrayList<>();
//    public static boolean isQueenSafe(boolean[][] board, int row, int col) {
//		for(int i=row; i>=0; i--)
//			if(board[i][col])
//				return false;
//		
//		for(int i=row, j=col; i>=0 && j>=0; i--, j--)
//			if(board[i][j])
//				return false;
//		
//		for(int i=row, j=col; i>=0 && j<board[row].length; i--, j++)
//			if(board[i][j])
//				return false;
//		
//		return true;
//	}
//
//    public static int countNQueens(boolean [][] board, int currRow){
//    	int count = 0;
//    	
//    	if(currRow == board.length){
//    		res.add(addQ(board));
//            return 1;   
//        }
//    	
//    	for(int col = 0; col < board[currRow].length; col++) {
//    		if(isQueenSafe(board, currRow, col)) {
//    			board[currRow][col] = true;
//    			int result = countNQueens(board, currRow + 1);
//    			count += result;
//    			board[currRow][col] = false;
//    		}
//    	}
//    	return count;
//    }
//    
//    public static List<String> addQ(boolean[][] board){
//        List<String> list = new ArrayList<>();
//        for(int i=0; i<board.length; i++){
//            String str = "";
//            for(int j=0; j<board[i].length; j++){
//                if(board[i][j])
//                    str += "Q";
//                else
//                    str += ".";
//            }
//            list.add(str);
//        }
//        return list;
//    }
//}
//
//class Solution {
//    public List<List<String>> solveNQueens(int n) {
//        MySolution s = new MySolution();
//        boolean[][] board = new boolean[n][n];
//        s.countNQueens(board, 0);
//        return s.res;
//    }
//}


