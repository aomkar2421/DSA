package interview.stack;

import java.util.Stack;

public class ValidParenthesis2 {
	public static void main(String[] args) {
		String s = "[()()]{}";
		System.out.println(solution(s));
	}

	private static boolean solution(String s) {

		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (stack.isEmpty()) {
				if (ch == ')' || ch == '}' || ch == ']') {
					return false;
				}
				stack.push(ch);
			}
			else if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else if (stack.peek() == '(' && ch == ')' || stack.peek() == '{' && ch == '}' || stack.peek() == '[' && ch == ']') {
				stack.pop();
			}
			else {
				return false;
			}
			
		}
		
		return stack.isEmpty();
	}
}
