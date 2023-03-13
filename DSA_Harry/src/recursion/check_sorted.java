package recursion;

import java.util.*;

public class check_sorted {
	
	//more memory consumption, we make a sorter array everytime
	public static boolean checkSorted(int[] arr) {
		if(arr.length <= 1) {
			return true;
		}
		
		int[] smallArr = new int[arr.length - 1];
		for(int i=1; i<arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		
		boolean ans = checkSorted(smallArr);
		if(!ans) {
			return false;
		}
		if(arr[0] <= arr[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//less memory consumption, we make windows everytime
	//SLIDING WINDOW type approach
	private static boolean checkSortedBetter(int[] arr,int StartIndex) {
		if(StartIndex >= arr.length - 1) {
			return true;
		}
		
		if(arr[StartIndex] > arr[StartIndex + 1]) {
			return false;
		}
		
		return checkSortedBetter(arr, StartIndex + 1);
	}
	public static boolean checkSortedBetter(int[] arr) {
		return checkSortedBetter(arr, 0);
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 1, 7, 9, 3};
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.println(checkSorted(arr));
		System.out.println(checkSortedBetter(arr1));
	}
}
