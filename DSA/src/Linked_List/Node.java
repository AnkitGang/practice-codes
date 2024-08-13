package Linked_List;

public class Node<T> {
	public T val;
	public Node<T> next;
	
	public Node(T data) {
		this.val = data;
		next = null;
	}
	
	Node<T> insert(T val, Node<T> head, int pos) {
		Node<T> toAdd = new Node<T>(val);
		if(pos == 0) {
			toAdd.next = head;
			return toAdd;
		}
		
		Node<T> prev = head;
		for(int i=0; i<pos-1; i++) {
			prev = prev.next;
		}
		
		toAdd.next = prev.next;
		prev.next = toAdd;
		return head;
	}
	
	void delete(Node<T> head, int pos) {
		if(pos == 0) {
			head = head.next;
			return;
		}
		
		Node<T> prev = head;
		for(int i=0; i<pos-1; i++) {
			prev = prev.next;
		}
		
		prev.next = prev.next.next;
	}
}