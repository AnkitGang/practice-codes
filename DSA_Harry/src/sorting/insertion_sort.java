package sorting;

import java.util.Arrays;

public class insertion_sort {
	public static void sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		System.out.print(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 2, 7, 8, 1, 5};
		sort(arr);
	}
}
