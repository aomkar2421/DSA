package interview.stackqueue.Impl;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	void push(int val) {
		q1.add(val);
		while (!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return q2.remove();
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return q2.peek();
	}

	boolean isEmpty() {
		return q2.size() == 0;
	}
	
	void print() {
		System.out.println(q2);
	}

	public static void main(String[] args) {
		StackUsingTwoQueue stack = new StackUsingTwoQueue();
		stack.push(10);
		stack.print();
		stack.push(20);
		stack.print();
		stack.push(30);
		stack.print();
		stack.push(40);
		stack.print();
		stack.push(50);
		stack.print();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		
	}
}
