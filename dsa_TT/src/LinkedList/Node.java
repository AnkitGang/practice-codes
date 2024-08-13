package LinkedList;

import java.util.Scanner;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public Node<T> add(Node<T> head, T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node<T> prev = head;
			while(prev.next != null) {
				prev = prev.next;
			}
			prev.next = newNode;
		}
		return head;
	}
	
	public void addPositionQWise(Node<T> head, int position, T data) {
		Node<T> newNode = new Node<>(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		int i=1;
		Node<T> temp = head;
		while(i <= position) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void deletePositionWise(Node<T> head, int position) {
		if(head == null) {
			System.out.println("Linked List is Empty");
			return;
		}
		if(position == 0) {
			head = head.next;
			return;
		}
		
		int i=1;
		Node<T> temp = head;
		while(i < position-1) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
	}
	
	public void printList(Node<T> start) {
		Node<T> temp = start;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
