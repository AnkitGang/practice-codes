package heap;

import java.util.*;

public class HeapImplementation {
	
	static class Heap {
		
		ArrayList<Integer> heap = new ArrayList<>();
		
		public void insertInMinHeap (int data) {
			// Step 1: Add at last
			heap.add(data);
			
			// Step 2: Fix Heap
			int childIndex = heap.size() - 1;
			int parentIndex = (childIndex-1)/2 ;
			
			while(heap.get(childIndex) < heap.get(parentIndex)) {
				// Swap
				int temp = heap.get(childIndex);
				heap.set(childIndex, parentIndex);
				heap.set(parentIndex, temp);
			}
		}
		
		public int peekInMinHeap() {
			return heap.get(0);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
