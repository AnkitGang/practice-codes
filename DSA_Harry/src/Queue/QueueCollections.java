package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
	public static void main(String [] args) {    // Queue is an Interface so we cant make object
		Queue<Integer> queue = new LinkedList<>();   // also if we use it by reference we have to complete all its methods present in interface clas
	    queue.add(10);                               //LinkedList class has already implemented Queue so we can use it like this.
	    queue.add(20);   
	    queue.add(30);						//Enqueue
	    System.out.println(queue.poll());   //Dequeue
	    System.out.println(queue.peek());   //Front
	    System.out.println(queue.size());   
	}                                     
}
