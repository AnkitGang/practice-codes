package sorting;

import java.util.*;

public class BubbleSort {
	public void bubbleSort(int [] arr) {
		
		//Optimized Bubble Sort
		boolean swap;
		
		for(int i=0; i<arr.length-1; i++) {		//largest element at last
			swap = false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false) {//No swap means sorted
				break;
			}
		}
		
		
		 //Normal Bubble Sort
//		int temp=0;
//		
//		for(int i=0; i<arr.length; i++) {	//Smallest element selecting and putting from start
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		//OR
		
//		for(int i=0; i<arr.length-1; i++) {	//largest element selecting and putting at last
//			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		*/
	}
	
	public void print(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array before Sorting:");
		bs.print(arr);
		
		bs.bubbleSort(arr);
		System.out.println("\nArray after Sorting:");
		bs.print(arr);
		
		sc.close();
	}

}
