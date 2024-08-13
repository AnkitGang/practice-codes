package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {  //LeetCode 1380
	public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> minValues = new ArrayList<>();
        //min value in a number
        int minRow = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                minRow = Math.min(minRow, matrix[i][j]);
            }
            minValues.add(minRow);
            minRow = Integer.MAX_VALUE;
        }

        //Max VAlue of column
        List<Integer> maxValues = new ArrayList<>();
        int maxCol = Integer.MIN_VALUE;
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                maxCol = Math.max(maxCol, matrix[j][i]);
            }
            maxValues.add(maxCol);
            maxCol = Integer.MIN_VALUE;
        }

        //compare min in a row and Max in col, so store result in a list
        List<Integer> result = new ArrayList<>();
        for(int minElem: minValues){
            if(maxValues.contains(minElem)){
                result.add(minElem);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		
	}

}
