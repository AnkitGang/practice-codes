package Linked_List;

//will only work if you have made intersection in the linked list

public class Intersection {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == headB)
            return headA;
        
        int lengthHeadA = listLength(headA);
        int lengthHeadB = listLength(headB);
        
        int traverse = 0;
        
        if(lengthHeadA < lengthHeadB){
            traverse = lengthHeadB - lengthHeadA;
            while(traverse != 0){
                headB = headB.next;
                --traverse;
            }
        }
        else{
            traverse = lengthHeadA - lengthHeadB;
            while(traverse != 0){
                headA = headA.next;
                --traverse;
            }
        }
        
        while(headA != null){
            if(headA == headB)
                return headA;
            if(headA.next == headB.next)
                return headA.next;
            
            headA = headA.next;
            headB = headB.next;
        }
        return null;        
    }
    
    public static int listLength(ListNode head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }
    
    public static void main(String [] args) {
    	ListNode headA = new ListNode(3);
    	ListNode headB = new ListNode(2);
    	ListNode.insert(3, headB, 1);
    	
    	ListNode.printList(headA);
    	System.out.println();
    	ListNode.printList(headB);
    	System.out.println();
    	
    	Intersection Inter = new Intersection();
    	ListNode ans = Inter.getIntersectionNode(headA, headB);
    	
    	System.out.println(ans);
    }
}
