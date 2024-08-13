package BackTracking;

//Leetcode Ques
public class sudokuSolver {
	    final int MAX_SIZE = 9;
	    
	    private boolean isPresentInRow(int row, char value){
	        //In a row traverse each col
	        for(int col = 0; col < MAX_SIZE; col++){
	            if(board[row][col] == value)
	                return true;
	        }
	        return false;
	    }
	    
	    private boolean isPresentInCol(int col, char value){
	        //In a col traverse each row
	        for(int row = 0; row < MAX_SIZE; row++){
	            if(board[row][col] == value)
	                return true;
	        }
	        return false;
	    }
	    
	    private boolean isPresentInSubGrid(int row, int col, char value){
	        int startRow = row - row % 3;
	        int startCol = col - col % 3;
	        for(int i=startRow; i<startRow + 3; i++){
	            for(int j=startCol; j<startCol + 3; j++){
	                if(board[i][j] == value)
	                    return true;
	            }
	        }
	        return false;
	    }
	    
	    private boolean isCorrectToPlaceANumber(int row, int col, char value){
	        return !isPresentInRow(row, value) && !isPresentInCol(col, value) && !isPresentInSubGrid(row, col, value);
	        //The value is present in row
	        //The value is present in col
	        //The value is present in subgrid
	    }
	    
	    char[][] board;
	    private boolean solveSudoku(int row, int col){
	        //If we reach to last column, then move to next row
	        if(col == MAX_SIZE){
	            //Jump to Next Row
	            row = row + 1;
	            col = 0;
	        }
	        
	        //If we cross the last row (9), we solve the sudoku (Termination Case)
	        if(row == MAX_SIZE){
	            return true;
	        }
	        
	        //If cell is not empty we move to next column
	        if(board[row][col] != '.'){
	            return solveSudoku(row, col+1);
	        }
	        
	        //If cell is empty, then place the digit(1-9 (Loop) ) but precheck isCorrectToPlaceANumber
	        for(int i=1; i<=MAX_SIZE; i++){
	            if(isCorrectToPlaceANumber(row, col, (char)(i + '0'))){  //to convert number to char
	                //We can place a digit in current cell
	                board[row][col] = (char)(i + '0');  //Value placed
	                //Move to the next column
	                boolean result = solveSudoku(row, col + 1);
	                if(result){
	                    //Solved the sudoku
	                    return true;  //Stack Fall
	                }
	                
	                //Now do BackTracking
	                board[row][col] = '.';
	            }
	        } //Loop Exhaust we need to Stack Fall
	        
	        return false;
	    }
	    
	    public void solveSudoku(char[][] board) {
	        this.board = board;
	        
	        solveSudoku(0, 0);
	        
	        
	        
	    }
}
