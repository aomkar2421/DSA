package interview.linkedlist;

import java.util.HashSet;

public class Cycle2 {
	public static void main(String[] args) {
		
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next = head.next.next;
        
//        printList(head);
        System.out.println(solution(head));
	}
	
    private static boolean solution(Node head) {
    	
    	if (head == null || head.next == null) {
			return false;
		}

    	Node slow = head;
    	Node fast = head;
    	
    	while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				return true;
			}
			
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