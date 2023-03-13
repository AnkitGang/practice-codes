package Linked_List;

import java.util.*;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int val) {
		this.val = val;
		next = null;
	}
	
	static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	static ListNode takeInput() {
		ListNode head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			ListNode newNode = new ListNode(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
//				ListNode temp = head;
//				while(temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode;  //tail = tail.next;
			}
			
			data = sc.nextInt();
		}
		
		sc.close();
		
		return head;
	}
	
	static ListNode insert(int data, ListNode head, int pos) {
		ListNode toAdd = new ListNode(data);
		if(pos == 0) {
			toAdd.next = head;
			return toAdd;
		}
		
		ListNode prev = head;
		for(int i=0; i<pos-1; i++) {
			prev = prev.next;
		}
		
		toAdd.next = prev.next;
		prev.next = toAdd;
		return head;
	}
	
	static void delete(ListNode head, int pos) {
		if(pos == 0) {
			head = head.next;
			return;
		}
		
		ListNode prev = head;
		for(int i=0; i<pos-1; i++) {
			prev = prev.next;
		}
		
		prev.next = prev.next.next;
	}
}
