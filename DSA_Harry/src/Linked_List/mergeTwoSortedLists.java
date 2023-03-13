package Linked_List;

class Lists {
	ListNode head;
	
	public void addToTheLast(ListNode node) {
		if(head == null) {
			head = node;
		}
		else {
			ListNode temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void printList() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
}

public class mergeTwoSortedLists {

	public static void main(String[] args) {
		Lists list1 = new Lists();
		Lists list2 = new Lists();
		
		list1.addToTheLast(new ListNode(5));
		list1.addToTheLast(new ListNode(10));
		list1.addToTheLast(new ListNode(15));
		System.out.println();
		System.out.println("list 1:");
		list1.printList();
		
		list2.addToTheLast(new ListNode(2));
		list2.addToTheLast(new ListNode(3));
		list2.addToTheLast(new ListNode(20));
		System.out.println();
		System.out.println("list 2:");
		list2.printList();
		
		list1.head = new Merge().sortedMergeLists(list1.head, list2.head);
		System.out.println();
		System.out.println("Merged List:");
		list1.printList();
	}
}

class Merge {
	//----->Using RECURSION<-----
//	ListNode sortedMergeLists(ListNode list1, ListNode list2) {
//		if(list1 == null) {
//			return list2;
//		}
//		if(list2 == null) {
//			return list1;
//		}
//		
//		if(list1.data < list2.data) {
//			list1.next = sortedMergeLists(list1.next, list2);
//			return list1;
//		}
//		else {
//			list2.next = sortedMergeLists(list1, list2.next);
//			return list2;
//		}
//	}
	
//	----->Using DUMMY NODE<-----
	ListNode sortedMergeLists(ListNode list1, ListNode list2) {
		ListNode dummyNode = new ListNode(0);
		ListNode tail = dummyNode;
		
		while(true) {
			if(list1 == null) {
				tail.next = list2;
				break;
			}
			if(list2 == null) {
				tail.next = list1;
				break;
			}
		
			if(list1.val <= list2.val) {
				tail.next = list1;
				list1 = list1.next;
				tail = tail.next;
			}
			else {
				tail.next = list2;
				list2 = list2.next;
				tail = tail.next;
			}
		}
		return dummyNode.next;
	}
}
