package LinkedList;

public class FindKthElementFromLast<T> {
	void kthElement(Node<T> head, int k) {
		Node<T> p = head;
		Node<T> q = head;
		
		//move q till kth
		for(int i=0; i<k; i++) {
			q = q.next;
		}
		
		//now move q till end
		while(q != null) {
			q = q.next;
			p = p.next;
		}
		
		System.out.println(k + "th element from last: " + p.data);
	}
	
	public static void main(String[] args) {
		Node<Integer> list = new Node<Integer>(10);
		Node<Integer> head = list;
		list.add(head, 20);
		list.add(head, 30);
		list.add(head, 40);
		list.add(head, 50);
		list.printList(head);
		int k = 2;
		
		FindKthElementFromLast<Integer> obj = new FindKthElementFromLast<>();
		obj.kthElement(list, k);
	}
}
