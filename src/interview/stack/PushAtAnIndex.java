package interview.stack;

import java.util.Stack;

public class PushAtAnIndex {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
				
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		int val = 90;
		int idx = 4;
		
		System.out.println(solution(st, val, idx));
		
	}

	private static Stack<Integer> solution(Stack<Integer> st, int val, int idx) {

		if (idx < 0 || idx > st.size()) {
			System.out.println("Give valid index");
			return st;
		}
		
		Stack<Integer> rt = new Stack<Integer>();
		int i = 0;
		while (i < idx) {
			rt.push(st.pop());
			i++;
		}
		
		st.push(val);
		
		while (!rt.isEmpty()) {
			st.push(rt.pop());
		}
		
		return st;
	}
}
