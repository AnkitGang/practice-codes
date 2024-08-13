package Queue;

//CIRCULAR QUEUE
public class QueueUsingArray {
	private int[] data;
	private int front;
	private int rear;
	private int size;

	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return (size == 0);
	}

	int front() throws QueueEmptyException {
		if (size == 0)
			throw new QueueEmptyException();
		return data[front];
	}

	void enqueue(int elem) throws QueueFullException {
		if(size == data.length) {
			//throw new QueueFullException();
			doubleCapacity();
		}
		if(size == 0) {
			front = 0;
		}
		
		size++;
//		rear++;
//		if(rear == data.length)
//			rear = 0;
		rear = (rear + 1) % data.length;
		data[rear] = elem;
	}

	private void doubleCapacity() {
		int [] temp = data;
		data = new int[2*temp.length];
		int index = 0;
		
		for(int i=front; i<temp.length; i++) {
			data[index] = temp[i];
			index++;
		}
		
		for(int j=0; j<front; j++) {
			data[index] = temp[j];
			index++;
		}
		
		front = 0;
		rear = temp.length - 1;
	}

	int dequeue() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		
		int temp = data[front];
		
//		front++;
//		if(front == data.length)
//			front = 0;
		front = (front + 1) % data.length; //when front is at last position in array becoz of dequeueing, it should come to first position	
		size--;
		if(size == 0) {   //when after inserting elements then u dequeue till no element left
			front = -1;   //then front and rear should restart
			rear = -1;
		}
		return temp;
	}
}
