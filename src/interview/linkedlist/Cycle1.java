package interview.linkedlist;

import java.util.HashSet;

public class Cycle1 {
	public static void main(String[] args) {
		
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        printList(head);
        solution(head);
	}
	
    private static boolean solution(Node head) {

    	HashSet<Node> hs = new HashSet<Node>();
    	Node temp = head;
    	
    	while (temp != null) {
			if (hs.contains(temp)) {
				return true;
			}
			
			hs.add(temp);
			temp = temp.next;
		}
		return false;
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}