package LinkedList;

import java.util.Scanner;

public class LLOperations<T> {
	Scanner sc = new Scanner(System.in);
	Node<T> head;
	Node<T> tail;
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = tail.next;
			//tail = newNode;
		}
	}
	
	public void addPositionQWise(int position, T data) {
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
	
	public void deletePositionWise(int position) {
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
	
	
	public static void main(String[] args) {
		LLOperations<Integer> list = new LLOperations<>();
		
//		Node<Integer> node = new Node<Integer>(100);
//		Node<Integer> node2 = new Node<Integer>(200);
//		node.next = node2;
		list.add(100);
		list.add(200);
		list.add(300);
		list.addPositionQWise(0, 0);
		list.deletePositionWise(0);
		list.deletePositionWise(2);
		
		list.printList(list.head);
	}
}
