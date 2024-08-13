package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
//	static boolean findPair(char a, char b){
//        if(a=='(' && b==')'){
//            return true;
//        }
//        if(a=='[' && b==']'){
//            return true;
//        }
//        if(a=='{' && b=='}'){
//            return true;
//        }
//        return false;
//    }
//	
//	public static boolean isValid(String s) {
//		if(s.length() % 2 != 0){
//            return false;
//        }
//
//        Stack<Character> stack = new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            char x = s.charAt(i);
//            if(x == '(' || x == '[' || x == '{') {
//                stack.push(x);
//                continue;
//            }
//            else{
//                if(stack.isEmpty())
//                    return false;
//                else if(!findPair(stack.peek(), x)){
//                    return false;
//                }
//                else{
//                    stack.pop();
//                }
//            }
//        }
//        
//        return stack.isEmpty();
//	}
	
	public static boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            
            if(stack.isEmpty())
                return false;
            
            char c;
            switch(x){
                case ')': 
                    c = stack.pop();
                    if(c == '[' || c == '{')
                        return false;
                    break;
                case ']':
                    c = stack.pop();
                    if(c == '(' || c == '{')
                        return false;
                    break;
                case '}':
                    c = stack.pop();
                    if(c == '(' || c == '[')
                        return false;
                    break;
            }
        }
        
        return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brackets: ");
		String s = sc.next();
		System.out.println(isValid(s));
		sc.close();
	}
}
