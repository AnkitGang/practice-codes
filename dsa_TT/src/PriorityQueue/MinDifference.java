package PriorityQueue;

import java.util.PriorityQueue;

public class MinDifference {
	static int minDifference(int[] arr) {
		if(arr.length < 2) {
			return 0;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //by default it stores in ascending order
		for(int i: arr) {
			minHeap.offer(i);
		}
		
		int min = Integer.MAX_VALUE;
		int top = minHeap.poll();
		
		while(!minHeap.isEmpty()) {
			int curr = minHeap.poll();
			int difference = curr - top;
			min = Math.min(min, difference);
			top = curr;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		int [] arr = {12, 3, 7, 2, 8, 9, 1};
		int ans = minDifference(arr);
		System.out.println(ans);
	}
}
