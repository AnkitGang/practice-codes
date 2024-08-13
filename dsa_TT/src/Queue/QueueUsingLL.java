package Queue;

import LinkedList.Node;

public class QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public T front() throws QueueEmptyException{
		if(size == 0)
			throw new QueueEmptyException();
		return front.data;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void enqueue(T elem) {
		Node<T> newNode = new Node<>(elem);
		if(size == 0) {
			front = newNode;
			rear = newNode; 
		}
		else {
			rear.next = newNode;
			rear = rear.next;
		}
		size++;
	}
	
	public T dequeue() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		
		T temp = front.data;
		front = front.next;
		if(size == 1)   //rear is still pointing to the node if one element is present and front is removed
			rear = null;
		size--;
		return temp;
	}
}
