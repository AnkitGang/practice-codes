package LinkedList;

public class MiddleElement<T> {
	void findMiddle(Node<T> head) {
		//Approach1 - count number of digits
		int count = 0;
		
		//Approach2 - two pointer approach
		Node<T> slow = head;
		Node<T> fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data); //mid value
	}
	
	public static void main(String[] args) {
		Node<Integer> list = new Node<Integer>(10);
		
	}
}
