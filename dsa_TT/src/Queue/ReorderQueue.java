package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReorderQueue {
	public static void reorderQueue(Queue<Integer> q) {
		if(q.size() % 2 != 0) {
			System.out.println("Input array of even size");
			return;
		}
		
		Queue<Integer> temp = new LinkedList<>();
		int halfSize = q.size() / 2;
		
		for(int i=0; i<halfSize; i++) {
			temp.offer(q.poll());
		}
		
		for(int i=0; i<halfSize; i++) {
			q.offer(temp.poll());
			q.offer(q.poll());
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		
		System.out.println("Before Reorder:");
		for(int e: q) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		reorderQueue(q);
		System.out.println("After reorder:");
		for(int e: q) {
			System.out.print(e + " ");
		}
	}
}
