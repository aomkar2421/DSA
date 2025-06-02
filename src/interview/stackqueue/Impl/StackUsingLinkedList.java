package interview.stackqueue.Impl;

public class StackUsingLinkedList {
	
	Node head;
	public StackUsingLinkedList() {
		head = null;
	}
	
	void push(int val) {
		Node node = new Node(val);
		
		node.next = head;
		head = node;
	}
	
	int pop() {
		if (isEmpty()) {
			System.out.println("Stck is Empty");
			return -1;
		}
//		if (head.next == null) {
//			int val = head.val;
//			head = null;
//			return val;
//		}
		int val = head.val;
		head = head.next;
		return val;
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return head.val;
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void printRev() {
		printRevHelper(head);
		System.out.println();
	}
	
	private void printRevHelper(Node node) {
		if (node == null) {
			return;
		}
		printRevHelper(node.next);
		System.out.print(node.val+" ");
	}

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.print();
		stack.printRev(); 
		System.out.println(stack.pop()); //50
		stack.printRev(); // 10 20 30 40
		System.out.println(stack.pop()); //40
		stack.printRev(); // 10 20 30
		System.out.println(stack.pop()); // 30
		stack.printRev(); // 10 20
		System.out.println(stack.pop()); //20
		stack.printRev(); //10
		System.out.println(stack.pop()); // 10
		stack.printRev();
		
	}
}
