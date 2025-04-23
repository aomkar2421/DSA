package interview.linkedlist;

import java.util.HashSet;

public class OddEvenIndex {
	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);

		printList(head);
		Node temp = solution(head);
		printList(temp);
	}

	private static Node solution(Node head) {

        if(head == null || head.next == null){
            return head;
        }
        
		Node temp = head;
		Node even = null;
		Node evenTemp = even;
		Node oddTemp = head;

		int cnt = 0;
		while (temp != null) {
			cnt++;
			if (cnt % 2 == 0) {
				if (even == null) {
					even = temp;
					evenTemp = even;
				}
				else {
					evenTemp.next = temp;
					evenTemp = evenTemp.next;
				}
			}
			else {
				if (temp != head) {
					oddTemp.next = temp;
					oddTemp = oddTemp.next;
				}
			}
			temp = temp.next;
		}
		
		evenTemp.next = null;
		oddTemp.next = even;
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