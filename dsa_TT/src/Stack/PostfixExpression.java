package Stack;

import java.util.Stack;

public class PostfixExpression {
	static int postfixResult(String s) {
		Stack<Integer> stack = new Stack<>();
		int n = s.length();
		int ans = 0; 
		for(int i=0; i<n; i++) {
			char current = s.charAt(i);
			if(Character.isDigit(current)) {
				stack.push(Character.getNumericValue(current));
			}
			else {
				int num1 = stack.pop();
				int num2 = stack.pop();
				switch (current) {
				case '+':
					ans = num1 + num2;
					break;
				case '-':
					ans = num2 - num1;
					break;
				case '*':
					ans = num1 * num2;
					break;
				case '/':
					ans = num2 / num1;
					break;
				case '%':
					ans = num2 % num1;
					break;
				case '^':
					ans = num2 ^ num1;
					break;
				}
				stack.push(ans);
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String str = "764+-";
		System.out.println(postfixResult(str));
	}
}
