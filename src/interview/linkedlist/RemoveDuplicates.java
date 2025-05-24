package interview.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next.next = new Node(9);
        
        printList(head);
        Node temp = solution(head);
        printList(temp);
	}
	
    private static Node solution(Node head) {

    	Node temp = head;
    	
    	while (temp != null && temp.next != null) {
			
    		if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;				
			}
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