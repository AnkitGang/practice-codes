package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> q) {
		Stack<Integer> stack = new Stack<>();
		while(!q.isEmpty()) {
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty()) {
			q.offer(stack.pop());
		}
	}
	
	
	public static void reverseBackTracking(Queue<Integer> q1) {
		if(q1.isEmpty()) {
			return ;
		}
		
		int front = q1.poll();
		reverseBackTracking(q1);
		q1.offer(front);
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println("Original Queue: " + q);
		reverseBackTracking(q);
		System.out.println("Revrsed Queue: " + q);
		reverseQueue(q);
		System.out.println("Reversed Queue: " + q);
	}
}
