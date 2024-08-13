package SortingAlgorithms;

public class BubbleSort {
	public static void bubbleSort(int [] arr, int n) {
		boolean flag;
		for(int i=0; i<n; i++) {
			flag = false;
			for(int j=0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == false) { //means if array is already sorted then we will know in first iteration only and will break ith loop
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 3, 8, 98, 33, 76};
		int n = 6;
		bubbleSort(arr, n);
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}
}
