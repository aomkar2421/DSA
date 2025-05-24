package interview.stack;

import java.util.Stack;

public class CopyStack {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st);
		
		Stack<Integer> st2 = new Stack<Integer>();
		while (!st.isEmpty()) {
			int a = st.pop();
			st2.push(a);
		}
		System.out.println(st2);
		
		Stack<Integer> st3 = new Stack<Integer>();
		while (!st2.isEmpty()) {
			int a = st2.pop();
			st3.push(a);
		}
		System.out.println(st3);
		
	}
}
