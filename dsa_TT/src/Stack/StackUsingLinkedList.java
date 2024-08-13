package Stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {
	private Node top;
	private int size;
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public StackUsingLinkedList() {
		top = null;
		size = 0;
	}
	
	public void push(int x) {
		Node newNode = new Node(x);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int poppedValue = top.data;
		top = top.next;
		size--;
		return poppedValue;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}
}
