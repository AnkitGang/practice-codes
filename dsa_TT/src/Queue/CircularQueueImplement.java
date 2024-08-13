package Queue;

public class CircularQueueImplement {
	int[] arr;
	int rear;
	int front;
	int size;
	int count;
	
	public CircularQueueImplement(int size) {
		this.size = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = -1;
		this.count = 0;
	}
	
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("Queue Is Full cannot perform Enqueue");
			return;
		}
		rear = (rear + 1) % size;
		arr[rear] = val;
		count++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		int value = arr[front];
		front = (front + 1) % size;
		count--;
		return value;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		return arr[front];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == size;
	}
	
	public static void main(String[] args) {
		CircularQueueImplement cq = new CircularQueueImplement(5);
		cq.enqueue(1);
		cq.enqueue(22);
		cq.enqueue(3);
		cq.enqueue(5);
		
		System.out.println("Front element : " + cq.peek());
		
		System.out.println("Dequeu element" + cq.dequeue());
		System.out.println("Dequeu element" + cq.dequeue());
		System.out.println("Front element : " + cq.peek());
		
		cq.enqueue(7);
		cq.enqueue(6);
		
	}
}
