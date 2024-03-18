package Stack;

import java.util.*;

//USING ANOTHER STACK ----> Time: O(n^2)  Space: O(n)
public class ReverseStack {
	public static void main(String [] args) {
		ReverseStack obj = new ReverseStack();
		
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println("Front: " + s.peek());
		
		obj.reverseStack(s);
		System.out.println("New Front: " + s.peek());
		obj.printStack(s);
	}
	
	void reverseStack(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<>();
		int n = s1.size();
		for(int i=0; i<n; i++) {
			int x = s1.peek();
			s1.pop();
			transfer(s1, s2, n-i-1);
			s1.push(x);
			transfer(s2, s1, n-i-1);
		}
	}
	
	void transfer(Stack<Integer> s1, Stack<Integer> s2, int n) {
		for(int i=0; i<n; i++) {
			s2.push(s1.pop());
		}
	}
	
	void printStack(Stack<Integer> s) {
		while(!s.isEmpty())
			System.out.println(s.pop() + " ");
	}
}
