package String;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// using stack
		String s = "The sky is blue";
		String arr[] = s.split(" ");
		Stack<String> st = new Stack<>();
		for (String str : arr)
			st.push(str);
		String result = "";

		while (!st.isEmpty())
			result += st.pop() + " ";
		result.trim();
		System.out.println(result);
	}
}
