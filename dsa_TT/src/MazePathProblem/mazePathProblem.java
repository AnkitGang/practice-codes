package MazePathProblem;

//import java.util.Scanner;
//
//public class mazePathProblem {
// //Assuming start position is always at (1, 1)
//	public static void mazePath(int rows, int cols, String str) { 
//		if(rows < 1 || cols < 1) {
//			return ;
//		}
//		
//		if(rows == 1 && cols == 1) {
//			System.out.println(str);
//			return;
//		}
//		
//		mazePath(rows - 1, cols, str + "D");
//		mazePath(rows, cols - 1, str + "R");
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter rows of Matrix: ");
//		int goalRow = sc.nextInt();
//		System.out.println("Enter cols of Matrix: ");
//		int goalCol = sc.nextInt();
//		
//		mazePath(goalRow, goalCol, "");
//		
//		sc.close();
//	}
//}

import java.util.ArrayList;

public class mazePathProblem {

    static ArrayList<String> getMazePos(int currentRow , int currentCol, int endRow, int endCol){
        
        // Termination Case (Positive Case and Negative Case)
        // Positive Case
        if(currentCol == endCol && currentRow == endRow){
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        // Negative Case
        if(currentCol>endCol || currentRow>endRow){
            ArrayList<String> result = new ArrayList<>();
            return result;
        }
        
        // All the Right and Down Result Store in Final Result
        ArrayList<String> finalResult = new ArrayList<>();
        // Move to the Right
        ArrayList<String> rightResult = getMazePos(currentRow, currentCol+1, endRow, endCol);
        for(String t : rightResult){
            finalResult.add("R"+ t);
        }
        // On BackTrack so we have another choice (Makes Branch)
        // Move to the Down
        ArrayList<String> downResult = getMazePos(currentRow+1, currentCol, endRow, endCol);
        for(String t : downResult){
            finalResult.add("D"+ t);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = getMazePos(0, 0, 2, 2);
        System.out.println(result);
    }
}
