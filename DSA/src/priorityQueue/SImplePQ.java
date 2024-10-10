package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SImplePQ {
	public static void main(String [] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();	// When making PQ of integer type, by default it puts smallest int (i.e. highest priority) on its front
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());	// for descending order
		
		pq.add(3);									// O(log(n))
		pq.add(4);
		pq.add(1);
		pq.add(6);
		pq.add(2);
		
		while(!pq.isEmpty()) {
			System.out.print(pq.peek() + ", ");		// O(1)
			pq.remove();							// O(log(n))
		}
		
	}
}
