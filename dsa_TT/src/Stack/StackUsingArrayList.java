package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {
	private ArrayList<Integer> stack;
	
	public StackUsingArrayList() {
		stack = new ArrayList<>();
	}
	
	public void push(int x) {
		stack.add(x);
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack Is Empty.");
		}
		int lastIndex = stack.size()-1;
		return stack.remove(lastIndex);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Stack Is Empty.");
		}
		int lastIndex = stack.size()-1;
		return stack.get(lastIndex);
	}
	
	public int size() {
		return stack.size();
	}
	
	public static void main(String[] args) {
		StackUsingArrayList stack = new StackUsingArrayList();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
	}
}
