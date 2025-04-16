package interview.linkedlist;

import java.util.HashSet;

public class FindIntersection {
	public static void main(String[] args) {

		Node head1 = new Node(5);
		head1.next = new Node(10);
		head1.next.next = new Node(15);
		head1.next.next.next = new Node(20);
		head1.next.next.next.next = new Node(25);
		head1.next.next.next.next.next = new Node(30);

		Node head2 = new Node(1);
		head2.next = new Node(2);
		head2.next.next = head1.next.next.next.next;

		printList(head1);
		printList(head2);
		Node temp = solution(head1, head2);
		System.out.println(temp.val);
	}

	private static Node solution(Node head1, Node head2) {
		
		int len1 = getLength(head1);
		int len2 = getLength(head2);
		Node temp;
		
		if (len1 > len2) {
			int diff = len1 - len2;
			temp = findIntersectionByDiff(head1, head2, diff);
		}
		else {
			int diff = len2-len1;
			temp = findIntersectionByDiff(head2, head1, diff);
		}
		
		return temp;
	}
	
	private static Node findIntersectionByDiff(Node head1, Node head2, int diff) {
		for (int i = 0; i < diff; i++) {
			head1 = head1.next;
		}
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		while (temp1 != null && temp2 != null) {
			if (temp1 == temp2) {
				return temp1;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return null;
	}

	private static int getLength(Node head1) {
		Node temp = head1;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.val+"->");
			node = node.next;
		}
		System.out.println();
	}
}