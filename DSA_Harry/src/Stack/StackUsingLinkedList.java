package Stack;

import Linked_List.Node;

public class StackUsingLinkedList<T> {
	private Node<T> head;
	private int size;
	
	public StackUsingLinkedList(){
		head = null;
		size = 0;
	}
	
	public void push(T elem) {
			Node<T> newNode = new Node<T>(elem);
			newNode.next = head;
			head = newNode;
			size++;
	}
	
	public T pop() throws StackEmptyException{
		if(size == 0) {
			throw new StackEmptyException();
		}
		T topVal = head.val;
		head = head.next;
		size--;
		return topVal;
	}
	
	public T top() throws StackEmptyException{
		if(head == null) {
			throw new StackEmptyException();
		}
		
		return head.val;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);    
		//return (head == null);
	}
}
