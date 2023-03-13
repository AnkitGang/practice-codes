package Linked_List;

import java.util.LinkedList;

public class CollectionsLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();  //Doubly Linked List by default
		list.add(1);
		list.add(3);
		list.addFirst(9);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
