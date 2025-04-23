package interview.linkedlist;

import java.util.HashSet;

public class OddEvenNumber2 {
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

    	Node even = null;
    	Node evenTemp = even;
    	Node temp = head;
    	Node prev = null;
    	
    	while (temp != null) {
    		if (temp.val % 2 == 0) {
    			
    			if (prev != null) {
					prev.next = temp.next;
				}
    			else {
					head = temp.next;
				}
				
    			if (even == null) {
					even = temp;
					evenTemp = even;
				}else {
					evenTemp.next = temp;
					evenTemp = evenTemp.next;
				}
			}else {
				prev = temp;
			}
    		temp = temp.next;
		}
    	
//    	prev.next = even;  // odd->even
    	evenTemp.next = head; //even -> odd
    	
    	return even;
    }

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }
}