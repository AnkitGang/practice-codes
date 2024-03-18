package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
	public static ArrayList<String> getPaths(int startRow, int startCol, int destRow, int destCol){
		if(startRow == destRow && startCol == destCol) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		
		ArrayList<String> hPaths = new ArrayList<>();
		ArrayList<String> vPaths = new ArrayList<>();
		
		if(startRow < destRow) {
			vPaths = getPaths(startRow + 1, startCol, destRow, destCol);
		}
		if(startCol < destCol) {
			hPaths = getPaths(startRow, startCol + 1, destRow, destCol);
		}
		
		ArrayList<String> paths = new ArrayList<>();
		for(String hpath: hPaths) {
			paths.add("h" + hpath);
		}
		
		for(String vpath: vPaths) {
			paths.add("v" + vpath);
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
		
		ArrayList<String> paths = getPaths(startRow, startCol, rows, cols);
		System.out.println(paths);
		sc.close();
	}
}
