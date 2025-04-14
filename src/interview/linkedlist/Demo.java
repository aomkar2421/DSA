package interview.linkedlist;

public class Demo {
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

    	
		
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}

class Node{
	Node next;
	int val;
	
	public Node(int val) {
		this.val = val;
		this.next = null;
	}
	
}