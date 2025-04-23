package interview.linkedlist;

import java.util.HashSet;

public class OddEvenNumber {
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
        Node temp = solution(head);
        printList(temp);
	}
	
    private static Node solution(Node head) {

    	Node odd = new Node(1);
    	Node even = new Node(2);
    	Node oddTemp = odd;
    	Node evenTemp = even;
    	
    	Node temp = head;
    	
    	while (temp != null) {
			if (temp.val%2 != 0) {
				oddTemp.next = temp;
				oddTemp = oddTemp.next;
			}else {
				evenTemp.next = temp;
				evenTemp = evenTemp.next;
			}
			temp = temp.next;
		}
    	
    	oddTemp.next = null;
    	evenTemp.next = odd.next;
    	return even.next;
    }

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}