package interview.stack;

import java.util.Stack;

public class DisplayRecursion {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
				
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		solution(st);
		
	}

	private static void solution(Stack<Integer> st) {

		if (st.size() <= 0) {
			return;
		}
		
		System.out.println(st.pop());
		solution(st);
	}
}
