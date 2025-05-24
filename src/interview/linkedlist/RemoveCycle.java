package interview.linkedlist;

import java.util.HashSet;

public class RemoveCycle {
	public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = head.next.next.next;
//        printList(head);
        solution(head);
	}
	
    private static Node solution(Node head) {
    	
    	if (head == null || head.next == null) {
			return head;
		}

    	Node slow = head;
    	Node fast = head;
    	
    	boolean flag = false;
    	while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				flag = true;
				break;
			}
		}
    	
    	int cnt = 0;
    	if (flag) {
			
    		slow = head;
    		
    		while (slow.next != fast.next) {
    			cnt++;
				slow = slow.next;
				fast = fast.next;
			}
    		fast.next = null;
    		return slow.next;
		}else {
			return head;
		}
    	
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}