package recursion;

import java.util.*;

public class last_index_of_x {
	
	private static int index(int[] arr, int target, int startIndex, int idx) {
		if(startIndex == arr.length) {
			return idx;
		}
		else if(arr[startIndex] == target) {	
			idx = startIndex;
		}
		
		return index(arr, target, startIndex + 1, idx);
	}
	
	public static int index(int[] arr, int target) {
		return index(arr, target, 0, -1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target = sc.nextInt();
		System.out.println("Index : " + index(arr, target));
		
		sc.close();
	}
}
