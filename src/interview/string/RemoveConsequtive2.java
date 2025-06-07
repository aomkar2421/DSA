package interview.string;

import java.util.Stack;

//input = abbaca
//output = ca

public class RemoveConsequtive2 {
	public static void main(String[] args) {
		String s = "abbbabaaa";
		System.out.println(s);
		System.out.println(solution(s));
		
	}

	private static String solution(String s) {
		
//		Stack<Character> stack = new Stack<Character>();
//		stack.push(s.charAt(0));
//		
//		for (int i = 1; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			
//			if (!stack.isEmpty() && ch == stack.peek() ) {
//				stack.pop();
//			}
//			else {
//				stack.push(ch);
//			}
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		
//		if (stack.size()>0) {
//			for (int i = 0; i <= stack.size(); i++) {
//				sb.append(stack.pop());
//			}			
//		}
//
//		
//		return sb.reverse().toString();
		
		System.out.println("nnew");
        if (s.length() == 1) return s;

		Stack<Character> stack = new Stack<Character>();
		
		for (char ch : s.toCharArray()) {			
			if (stack.isEmpty() || ch != stack.peek() ) {
				stack.push(ch);
			}
			else {
				stack.pop();
			}
		}
		
		
        String res = "";
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }

        return res;
	}
}
