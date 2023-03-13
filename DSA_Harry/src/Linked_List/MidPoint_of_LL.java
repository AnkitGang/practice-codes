package Linked_List;

public class MidPoint_of_LL {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode.insert(2, head, 1);
		ListNode.insert(3, head, 2);
		ListNode.insert(4, head, 3);
		ListNode.insert(5, head, 4);
		ListNode.insert(6, head, 5);
		ListNode.insert(7, head, 6);
		ListNode.printList(head);
		
		int mid = midPoint(head);
		System.out.println();
		System.out.println(mid);
	}
	
	public static int midPoint(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null) {
			if(fast.next.next == null) {
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}
}