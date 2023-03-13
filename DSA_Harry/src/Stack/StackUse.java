package Stack;

public class StackUse {
	public static void main(String[] args) throws StackFullException/*, StackEmptyException*/ {
//		StackUsingArray stack = new StackUsingArray();
//		
//		for(int i=1; i<=11; i++) 
//			stack.push(i);
//		
//		while(!stack.isEmpty()) {
//			//System.out.println(stack.pop());   //we can also add try and catch or we can throw in main function
//			try {
//				System.out.println(stack.pop());
//			} catch (StackEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();     //We will never reach here becoz while loop will stop beforehand only if stack is empty ;)
//			}
//		}
//		
//		System.out.println(stack.isEmpty());
//		try {
//			System.out.println(stack.top());
//		} catch (StackEmptyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(stack.size());
//		
//		
//		System.out.println();
		
		
		StackUsingLinkedList<Integer> stack1 = new StackUsingLinkedList<>();
		for(int i=1; i<=11; i++) 
			stack1.push(i);
		
		while(!stack1.isEmpty()) {
			try {
				System.out.println(stack1.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(stack1.isEmpty());
		System.out.println(stack1.size());
		try {
			System.out.println(stack1.top());
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
