package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public StackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public void push(int x) {
		q2.add(x);
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack isEmpty");
		}
		return q1.remove();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	
	public int size() {
		return q1.size();
	}
	
	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
	}
}
