package Array;

import java.util.*;

public class validSudoku {
	public static void main(String[] args) {
		char[][] board = {{'.','.','4','.','.','.','6','3','.'},
		                  {'.','.','.','.','.','.','.','.','.'},
		                  {'5','.','.','.','.','.','.','9','.'},
		                  {'.','.','.','5','6','.','.','.','.'},
		                  {'4','.','3','.','.','.','.','.','1'},
		                  {'.','.','.','7','.','.','.','.','.'},
		                  {'.','.','.','5','.','.','.','.','.'},
		                  {'.','.','.','.','.','.','.','.','.'},
		                  {'.','.','.','.','.','.','.','.','.'}};
		
		System.out.println(isValidSudoku(board));
	}
	
	public static boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++)
            if(!isValidRow(board[i]))
                return false;
        
        for(int i=0; i<9; i++) {
        	char[] col = new char[9];
        	for(int j=0; j<9; j++) {
        		col[j] = board[j][i];
        	}
            if(!isValidCol(col))
                return false;
        }

        for(int i=0; i<9; i+=3)
            for(int j=0; j<9; j+=3)
                if(!isValidBox(i, j, board))
                    return false;

        return true;
    }

    private static boolean isValidRow(char[] row){
        HashSet<Character> rowSet = new HashSet<>();
        for(char c : row){
            if(c != '.'){
                if(rowSet.contains(c))
                    return false;
                else
                    rowSet.add(c);
            }
        }

        return true;
    }

    private static boolean isValidCol(char[] col){
        HashSet<Character> colSet = new HashSet<>();
        for(char c : col){
            if(c != '.'){
                if(colSet.contains(c))
                    return false;
                else
                    colSet.add(c);
            }
        }

        return true;
    }

    private static boolean isValidBox(int row, int col, char[][] board){
        HashSet<Character> boxSet = new HashSet<>();

        for(int i=row; i<row + 3; i++)
            for(int j=col; j<col + 3; j++){
                if(board[i][j] == '.')
                    continue;
                if(boxSet.contains(board[i][j]))
                    return false;
                boxSet.add(board[i][j]);
            }
        
        return true;
    }
}
