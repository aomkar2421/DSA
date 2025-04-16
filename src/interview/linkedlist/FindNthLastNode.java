package interview.linkedlist;

import java.util.HashSet;

public class FindNthLastNode {
	public static void main(String[] args) {
		
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);
//        head.next.next.next.next.next.next.next = new Node(8);
        
        printList(head);
        System.out.println(solution(head, 5));
	}
	
    private static int solution(Node head, int k) {

    	Node slow = head;
    	Node fast = head;
    	
    	for (int i = 0; i < k; i++) {
			if (fast == null) {
				return -1;
			}
			fast = fast.next;
		}
    	
    	while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
    	
		return slow.val;
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}