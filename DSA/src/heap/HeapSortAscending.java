package heap;

public class HeapSortAscending {		// O(nlog(n)) Time Complexity
	public static void heapify(int[] heap, int i, int size) {
		int left = 2*i+1;
		int right = 2*i+2;
		int maxIdx = i;
		
		if(left<size && heap[left]>heap[maxIdx]) {
			maxIdx = left;
		}
		
		if(right<size && heap[right]>heap[maxIdx]) {
			maxIdx = right;
		}
		
		if(maxIdx != i) {
			int temp = heap[i];
			heap[i] = heap[maxIdx];
			heap[maxIdx] = temp;
			
			heapify(heap, maxIdx, size);	// again calling for changes occurred in children due to swapping 
		}
	}
	
	public static void heapSort(int [] heap) {		// For Ascending order
		// Step 1- Build Max Heap
		int n = heap.length;
		
		for(int i=n/2; i>=0; i--) {			// We only want to heapify elements other than leaf (i.e. all parents)
			heapify(heap, i, n);
		}
		
		// Step 2- Swap first and last element and then remove last
		for(int i=n-1; i>0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			
			heapify(heap, 0, i);		// heapify whole array (or tree) after removing last element ('i' is decrementing)
		}
	}
	
	public static void main(String [] args) {
		int[] heap = {1, 2, 4, 5, 3};
		heapSort(heap);
		
		for(int i=0; i<heap.length; i++)
			System.out.print(heap[i] + " ");
	}
}
