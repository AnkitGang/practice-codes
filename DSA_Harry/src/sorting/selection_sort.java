package sorting;

import java.util.Arrays;

public class selection_sort {
	void sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}	
		}

		System.out.print(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		selection_sort s1 = new selection_sort();
		int[] arr = {4, 2, 6, 4, 7, 1, 8, 9};
		s1.sort(arr);
	}
}
