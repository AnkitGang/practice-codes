package LinkedList;

public class DetectCycleAndRemoveCycle<T> {
	void detectCycle(Node<T> head) {
		Node<T> slow = head;
		Node<T> fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) { //when even number of nodes
				System.out.println("yes cycle..");
				break;
			}
		}
		if(slow != fast) {
			System.out.println("no cycle");
			return;
		}
		
		slow = head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next.next;
		}
		fast.next = null;  //break the cycle
	}
}
