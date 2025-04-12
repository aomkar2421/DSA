package interview.linkedlist;

import java.util.HashSet;

public class CountLoopNodes {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		head.next.next.next.next.next.next.next.next = head.next.next.next;
		//        printList(head);
		System.out.println(solution(head));
	}

	private static int solution(Node head) {

		if (head == null || head.next == null) {
			return 0;
		}

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		if (slow != fast) {
			return 0;
		}


		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		fast = fast.next;
		
		int count = 1;
		while (fast != slow) {
			fast = fast.next;
			count++;
		}
		
		return count;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.val+"->");
			node = node.next;
		}
		System.out.println();
	}
}