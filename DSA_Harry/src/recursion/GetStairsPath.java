package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {  //person can either jump 1,2,3 steps from top..how many such paths possible
	public static ArrayList<String> getPaths(int stairs) {
		//when paths become 0 or -1 or -2
		if(stairs == 0) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		else if(stairs < 0) {
			ArrayList<String> baseRes = new ArrayList<>();
			return baseRes;
		}
		
		ArrayList<String> path1 = getPaths(stairs-1);
		ArrayList<String> path2 = getPaths(stairs-2);
		ArrayList<String> path3 = getPaths(stairs-3);
		
		ArrayList<String> paths = new ArrayList<>();
		
		for(int i=0; i<path1.size(); i++) {
			paths.add(1 + path1.get(i));
		}
		
		for(int i=0; i<path2.size(); i++) {
			paths.add(2 + path2.get(i));
		}
		
		for(int i=0; i<path3.size(); i++) {
			paths.add(3 + path3.get(i));
		}
		
		return paths;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of stairs: ");
		int stairs = sc.nextInt();
		
		ArrayList<String> paths = getPaths(stairs);
		System.out.println(paths);
		
		sc.close();
	}
}
