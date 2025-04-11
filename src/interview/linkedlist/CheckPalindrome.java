package interview.linkedlist;

import java.util.HashSet;

public class CheckPalindrome {
	public static void main(String[] args) {
		
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(1);
		
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(3);
//        head.next.next.next.next.next = new Node(2);
//        head.next.next.next.next.next.next = new Node(1);
        
        printList(head);
        System.out.println(solution(head));
	}
	
    private static boolean solution(Node head) {

    	Node slow = head;
    	Node fast = head;
    	
    	while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

    	Node head2 = reverseLL(slow);
    	printList(head2);
    	boolean ans = check(head, head2);

		return ans;
	}

	private static boolean check(Node head, Node head2) {
		Node temp1 = head;
		Node temp2 = head2;
		
		while (temp2 != null) {
			if (temp1.val != temp2.val) {
				return false;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		
		return true;
	}

	private static Node reverseLL(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = curr.next;
		
		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (curr != null) {
				next = curr.next;
			}
		}
		
		return prev;
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}