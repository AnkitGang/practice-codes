package Linked_List;

public class IsPalindrome {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		//ListNode.insert(1, head, 0);
		ListNode.insert(2, head, 1);
		ListNode.insert(3, head, 2);
		ListNode.insert(4, head, 3);
        
        printList(head);
        System.out.println();
        ListNode newhead = reverseList(head);
        printList(newhead);
        
        isPalindrome(head);
	}
	
	public static boolean isPalindrome(ListNode head) {
		
		if(head == null)
            return false;
		
		ListNode temp = head;
        ListNode newHead = reverseList(temp);
        System.out.println("this");
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        
        //printList(newHead);
        System.out.println("hi");
        
        while(newHead != null && head != null){
        	System.out.println();
        	System.out.println(head.val);
        	System.out.println(newHead.val);
        	
            if(head.val != newHead.val){
            	System.out.println("hiiii");
                return false;
            }
            
            	System.out.println("yep");
                head = head.next;
                newHead = newHead.next;
            
        }
                        
        if(head == null && newHead == null) {
        	System.out.println("yo");
            return true;
        }
        return false;
    }
    
    static ListNode reverseList(ListNode temp) {
		ListNode prev = null;
        ListNode curr = temp;
        ListNode nex = null;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;	
            curr = nex;
        }
        temp = prev;
        return temp	;
	}
    
    static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
