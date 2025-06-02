package interview.stackqueue.Impl;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

	Queue<Integer> queue = new LinkedList<Integer>();

	void push(int val) {
		int size = queue.size();
		queue.add(val);

		for (int i = 0; i < size; i++) {
			queue.add(queue.remove());
		}

	}

	int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return queue.remove();
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return queue.peek();
	}

	void print() {
		System.out.println(queue);
	}

	boolean isEmpty() {
		return queue.size() == 0;
	}

	public static void main(String[] args) {
		StackUsingSingleQueue stack = new StackUsingSingleQueue();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		stack.print();

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
