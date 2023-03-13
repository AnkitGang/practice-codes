package Linked_List;
import java.util.*;

public class FindNode {
	
	static int find(Node<Integer> head, int data){
		int pos = 1;
		while(head.val != data && head != null) {
			head = head.next;
			pos++;
		}
		if(head.val == -1 || head == null) {
			return -1;
		}
		return pos;
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head = null ,tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data); 
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		sc.close();
		return head;
	}
	
	static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);

		System.out.println("Position: " + find(head, 5));
	}

}
