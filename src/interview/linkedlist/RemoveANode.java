package interview.linkedlist;

import java.util.HashSet;

public class RemoveANode {
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
        solution(head.next.next.next.next);
        printList(head);
	}
	
    private static void solution(Node node) {

    	node.val = node.next.val;
    	node.next = node.next.next;
    	
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}