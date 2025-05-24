package interview.linkedlist;

import java.util.Stack;

public class Reverse2 {
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

        Stack<Node> stack = new Stack<>();

        Node temp = head;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        if (!stack.isEmpty()) {
            head = stack.pop();
            temp = head;

            while (!stack.isEmpty()) {
              
                temp.next = stack.pop();                
                temp = temp.next;
            }

            temp.next = null;
        }
        
    	printList(head);
		
	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}