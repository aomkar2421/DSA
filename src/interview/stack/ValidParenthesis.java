package interview.stack;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String s = "(())((()()(())))";
		System.out.println(solution(s));
	}

	private static boolean solution(String s) {

		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (stack.isEmpty()) {
				stack.push('(');
			}
			else if (ch == '(') {
				stack.push('(');
			}
			else {
				stack.pop();
			}
			
		}
		
		return stack.isEmpty();
	}
}
