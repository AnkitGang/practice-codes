package Stack;

import java.util.Stack;

public class PrefixExpression {
	//only for 0-9 numbers it works 
	static int prefixResult(String s) {
		Stack<Integer> stack = new Stack<>();
		int n = s.length();
		int ans = 0; 
		for(int i=n-1; i>=0; i--) {
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
					ans = num1 - num2;
					break;
				case '*':
					ans = num1 * num2;
					break;
				case '/':
					ans = num1 / num2;
					break;
				case '%':
					ans = num1 % num2;
					break;
				case '^':
					ans = num1 ^ num2;
					break;
				}
				stack.push(ans);
			}
			
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		String str = "+-544";
		System.out.println(prefixResult(str));
	}
}
