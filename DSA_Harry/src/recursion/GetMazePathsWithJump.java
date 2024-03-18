package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {  //can jump 1,2,3,....n like in getStairsPath
	public static ArrayList<String> getPathsWithJump(int startRow, int startCol, int destRow, int destCol) {
		if(startRow == destRow && startCol == destCol) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		ArrayList<String> paths = new ArrayList<>();
		
		for(int h = 1; h <= destCol-startCol; h++) {
			ArrayList<String> hPaths = new ArrayList<>(); //horizontal path
			hPaths = getPathsWithJump(startRow, startCol + h, destRow, destCol);
			for(String hPath: hPaths) {
				paths.add("h" + h + hPath);
			}
		}
		
		for(int v = 1; v <= destRow-startRow; v++) {
			ArrayList<String> vPaths = new ArrayList<>(); //vertical path
			vPaths = getPathsWithJump(startRow + v, startCol, destRow, destCol);
			for(String vPath: vPaths) {
				paths.add("v" + v + vPath);
			}
		}
		
		for(int d = 1; d <= destCol-startCol && d <= destRow-startRow ; d++) {
			ArrayList<String> dPaths = new ArrayList<>(); //diagonal path
			dPaths = getPathsWithJump(startRow + d, startCol + d, destRow, destCol);
			for(String dPath: dPaths) {
				paths.add("d" + d + dPath);
			}
		}
		
		return paths;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Rows in Matrix: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of Cols in Matrix: ");
		int cols = sc.nextInt();
		System.out.println("Enter start Row index: ");
		int startRow = sc.nextInt();
		System.out.println("Enter start Col index: ");
		int startCol = sc.nextInt();
		
		ArrayList<String> paths = getPathsWithJump(startRow, startCol, rows, cols);
		System.out.println(paths);
		sc.close();
	}
}
