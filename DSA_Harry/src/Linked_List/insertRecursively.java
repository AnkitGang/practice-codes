package Linked_List;

public class insertRecursively {
	public static ListNode insert(ListNode head, int pos, int elem) {
		if(head == null)
			return head;
		
		if(pos == 0) {
			ListNode newNode = new ListNode(elem);
			newNode.next = head;
			return newNode;
		}
		
		head.next = insert(head.next, pos-1, 10);
		return head;
	}

	public static void main(String[] args) {
		ListNode head = ListNode.takeInput();
		head = insert(head, 8, 10);
		ListNode.printList(head);
	}
}
