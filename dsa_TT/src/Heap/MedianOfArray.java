package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfArray {
	static double findMedian(int[] arr) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		//Creating 2 Heaps
		for(int i=0; i<arr.length; i++) {
			if(maxHeap.isEmpty() || maxHeap.peek() >= arr[i]) {
				maxHeap.add(arr[i]);
			}
			else {
				minHeap.add(arr[i]);
			}
			
			if(maxHeap.size() > minHeap.size()+1) {
				minHeap.add(maxHeap.poll());
			}
			else if(maxHeap.size() < minHeap.size()) {
				maxHeap.add(minHeap.poll());
			}
		}
		
		if(maxHeap.size() == minHeap.size()) {
			return (maxHeap.peek() + minHeap.peek()) / 2.0;
		}
		else {
			return maxHeap.peek();
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = {3, 8, 4, 9, 5};
//		System.out.println(findMedian(arr));
//		
//		int[] arr1 = {1, 2, 3, 4, 5, 6};
//		System.out.println(findMedian(arr1));
		
		int[] arr = {5};
		System.out.println(findMedian(arr));
		
		int[] arr1 = {};
		System.out.println(findMedian(arr1));
	}
}
