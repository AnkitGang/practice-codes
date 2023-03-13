package Stack;

import java.util.*;

public class MaxNestingDepthOfParentheses {
	public static void main(String[] args) {
		MaxNestingDepthOfParentheses p = new MaxNestingDepthOfParentheses();
		String s = "(1)+((2))+(((3)))";
		System.out.println(p.maxDepth(s));
	}
	
	public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            }
            else if(c == ')'){
                if(count < stack.size())
                    count = stack.size();
                
                stack.pop();
            }
        }
        
        return count;
	}
}
