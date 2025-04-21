package interview.linkedlist;

import java.util.HashSet;

public class MergeSortedLL {
	public static void main(String[] args) {

		Node head1 = new Node(5);
//		head1.next = new Node(11);
//		head1.next.next = new Node(15);
//		head1.next.next.next = new Node(40);
//		head1.next.next.next.next = new Node(45);

		Node head2 = null;
//		Node head2 = new Node(1);
//		head2.next = new Node(2);
//		head2.next.next = new Node(20);
//		head2.next.next.next = new Node(25);

		printList(head1);
		printList(head2);
		Node temp = solution(head1, head2);
		printList(temp);
	}

	private static Node solution(Node head1, Node head2) {
		
		if (head1 == null && head2 == null) {
			return null;
		}
		
		if (head1 == null) {
			return head2;
		}
		
		if (head2 == null) {
			return head1;
		}

		Node temp1 = head1;
		Node temp2 = head2;

		Node head;
		Node temp;

		if (temp1.val < temp2.val) {
			head = temp1;
			temp = temp1;
			temp1 = temp1.next;
		}
		else {
			head = temp2;
			temp = temp2;
			temp2 = temp2.next;
		}

		while (temp1 != null && temp2 != null) {

			if (temp1.val < temp2.val) {
				temp.next = temp1;
				temp = temp1;
				temp1 = temp1.next;
			}
			else {
				temp.next = temp2;
				temp = temp2;
				temp2 = temp2.next;
			}

		}

		while (temp1 != null) {
			temp.next = temp1;
			temp = temp1;
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			temp.next = temp2;
			temp = temp2;
			temp2 = temp2.next;
		}

		return head;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.val+"->");
			node = node.next;
		}
		System.out.println();
	}
}