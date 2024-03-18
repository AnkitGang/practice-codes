package Linked_List;

public class IsPalindrome {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		//ListNode.insert(1, head, 0);
		ListNode.insert(2, head, 1);
		ListNode.insert(2, head, 2);
		ListNode.insert(1, head, 3);
        
        printList(head);
        System.out.println();
        
        System.out.println(isPalindrome(head));
	}
	
	public static boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        mid = rev(mid);

        while(mid != null){
            if(head.val != mid.val){
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }
    
    public static ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = null;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
    
    static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
