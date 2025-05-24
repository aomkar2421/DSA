package interview.linkedlist;

public class Reverse {
	public static void main(String[] args) {
		
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        printList(head);
        solution(head);
	}
	
    private static void solution(Node head) {

    	Node curr = head;
    	Node prev = null;
    	Node next = curr.next;
    	
    	while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (curr != null) {
				next = curr.next;
			}
		}
    	printList(prev);
		
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}