package interview.stackqueue.Impl;

import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingTwoStacks {


	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	boolean isEmpty() {
		return s1.size() == 0;
	}

	//expensive enque and normal deque, peek
	void enque(int val) {

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		s1.push(val);

		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}


	int deque() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return s1.pop();
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return s1.peek();
	}


	//normal enque and expensive deque, peek
	//	void enque(int val) {
	//		s1.push(val);
	//	}
	//
	//
	//	int deque() {
	//		if (isEmpty()) {
	//			System.out.println("Queue is empty");
	//			return -1;
	//		}
	//
	//		while (s1.size() > 1) {
	//			s2.push(s1.pop());
	//		}
	//
	//		int val = s1.pop();
	//
	//		while (!s2.isEmpty()) {
	//			s1.push(s2.pop());
	//		}
	//		return val;
	//	}
	//
	//	int peek() {
	//		if(isEmpty()){
	//			return -1;
	//		}
	//
	//		while (s1.size() > 1) {
	//			s2.push(s1.pop());
	//		}
	//
	//		int val = s1.peek();
	//
	//		while (!s2.isEmpty()) {
	//			s1.push(s2.pop());
	//		}
	//		return val;
	//	}

	void print() {
		for (int i = s1.size()-1; i >= 0; i--) {
			System.out.print(s1.get(i)+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();

	}

}
