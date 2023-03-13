package Linked_List;

public class DeleteRecursively {
	public static ListNode delete(ListNode head, int pos) {
		if(head == null)
			return head;
		
		if(pos == 0) 
			return head.next;
		
		head.next = delete(head.next, pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.takeInput();
		head = delete(head, 0);
		ListNode.printList(head);
	}
}
