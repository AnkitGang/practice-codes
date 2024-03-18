package Linked_List;

public class MergeSort_in_LL {
	
	public static ListNode merge(ListNode left, ListNode right){
        ListNode list = null;
        
        if(left == null)
            return right;
        if(right == null)
            return left;
        
        if(left.val < right.val){
            list = left;
            list.next = merge(left.next, right);
        }
        else{
            list = right;
            list.next = merge(left, right.next);
        }
        
        return list;
    }
    
    public static ListNode divide(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode mid = midPoint(head);
        ListNode midNext = mid.next;
        
        mid.next = null;
        
        ListNode left = divide(head);
        ListNode right = divide(midNext);
        
        ListNode sortedList = merge(left, right);
        
        return sortedList;
    }
    
    public static ListNode midPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null){
            if(fast.next.next == null)
                break;
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
	public static void main(String [] args) {
		ListNode head = new ListNode(1);
		ListNode.insert(5, head, 1);
		ListNode.insert(2, head, 2);
		ListNode.insert(9, head, 3);
		ListNode.insert(6, head, 4);
		ListNode.insert(8, head, 5);
		ListNode.insert(7, head, 6);
		ListNode.printList(head);
		
		divide(head);
		System.out.println();
		ListNode.printList(head);
	}
}
