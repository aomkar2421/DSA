package interview.linkedlist;

import java.util.HashSet;

public class RemoveNthLastNode {
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
		Node temp = solution(head, 8);
		printList(temp);
	}
	
    private static Node solution(Node head, int k) {
    	
    	Node dummy = new Node(0);
    	dummy.next = head;
    	
    	Node slow = dummy;
    	Node fast = dummy;
    	
    	for (int i = 0; i <= k; i++) {
			fast = fast.next;
		}
    	
    	while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
    	
    	slow.next = slow.next.next;
		return dummy.next;
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}