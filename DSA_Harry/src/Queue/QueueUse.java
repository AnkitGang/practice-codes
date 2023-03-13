package Queue;

public class QueueUse {

	public static void main(String[] args) {
		
		//BEFORE DYNAMIC ARRAY
//		QueueUsingArray queue = new QueueUsingArray();
//		for(int i=1; i <= 5; i++)
//			try {
//				queue.enqueue(i);
//			} catch (QueueFullException e) {
//				
//			}
//		
//		while(! queue.isEmpty())
//			try {
//				System.out.println(queue.dequeue());
//			} catch (QueueEmptyException e) {
//				
//			}
		
		
		//AFTER DYNAMIC ARRAY
//		QueueUsingArray queue = new QueueUsingArray(3);
//		for(int i=1; i <= 5; i++)
//			try {
//				queue.enqueue(i);
//			} catch (QueueFullException e) {
//				
//			}
//		
//		while(! queue.isEmpty())
//			try {
//				System.out.println(queue.dequeue());
//			} catch (QueueEmptyException e) {
//				
//			}
		
		
		//USING LINKED LIST
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		for(int i=1; i <= 5; i++)
			queue.enqueue(i);		
		
		while(! queue.isEmpty())
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
	}

}
