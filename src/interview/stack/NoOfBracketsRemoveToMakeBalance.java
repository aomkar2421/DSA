package interview.stack;

import java.util.Stack;

public class NoOfBracketsRemoveToMakeBalance {
	public static void main(String[] args) {
		String s = "[()()]{}}}(](){{}}[]";
		System.out.println(solution(s));
	}

	private static int solution(String s) {

		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (stack.isEmpty()) {
				stack.push(ch);
			}
			else if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else if (stack.peek() == '(' && ch == ')' || stack.peek() == '{' && ch == '}' || stack.peek() == '[' && ch == ']') {
				stack.pop();
			}
			else {
				stack.push(ch);
			}
			System.out.println(" ch : "+ch);
			System.out.println(stack);
		}
		
		return stack.size();
	}
}
