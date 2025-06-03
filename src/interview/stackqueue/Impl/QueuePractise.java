package interview.stackqueue.Impl;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractise {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= 5; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);

//		for (int i = 1; i <= 5; i++) {
//			System.out.println(queue.remove());
//		}

	}
}
