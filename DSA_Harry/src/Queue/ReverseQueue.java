package Queue;

import  java.util.*;

public class ReverseQueue {
	public static void main(String[] args) {
		ReverseQueue obj = new ReverseQueue();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<5; i++) {
			q.add(i);
		}
		
		obj.reverseQueue(q);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
	
	void reverseQueue(Queue<Integer> q) {  //Using Stack
		Stack<Integer> stack = new Stack<>();
		
		while(!q.isEmpty())
			stack.add(q.poll());
		while(!stack.isEmpty())
			q.add(stack.pop());
	}
}
