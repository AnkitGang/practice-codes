package Linked_List;

public class reverseLinkedList {
	
	/*static ListNode reverseList(ListNode head) {
		ListNode prev = null;
        ListNode curr = head;
        ListNode nex = null;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;	
            curr = nex;
        }
        head = prev;
        return head	;
	}
	
	static void LengthOfLinkedList(ListNode head) {
		
	}*/
	
	static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	
	
	
	//REVERSE RECURSIVELY    ---->   Time Complexity O(n^2)
	/*static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) 
			return head;
		
		ListNode finalHead = reverseList(head.next);
		ListNode temp = finalHead;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = head;
		head.next = null;
		
		return finalHead;
	}*/
	
	
	
	
	//REVERSE RECURSIVELY DOUBLE    ---->   Time Complexity O(n)
	//class DoubleNode below code
	/*static DoubleNode reverseListBetter(ListNode head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		DoubleNode smallAns = reverseListBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		
		return ans;
	}*/

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        ListNode n = new ListNode(2);
       
        head.next = n;
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        printList(head);
        System.out.println();
        //ListNode newhead = reverseList(head);
        //printList(newhead);
        
//      DoubleNode ans = new DoubleNode();
//      ans = reverseListBetter(head);
//      printList(ans.head);
      
	}

}

class DoubleNode{
	ListNode head;
	ListNode tail;
}
