package interview.stackqueue.Impl;

public class QueueUsingLinkedList {
	
	Node rear;
	Node front;
	
	public QueueUsingLinkedList() {
		rear = null;
		front = null;
	}
	
	boolean isEmpty() {
		return front == null;
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Queue Is Empty");
			return -1;
		}
		return front.val;
	}
	
	void enque(int val) {
		Node node = new Node(val);
		
		if (isEmpty()) {
			front = node;
			rear = node;
			return;
		}
		
		rear.next = node;
		rear = node;
	}
	
	int deque() {
		if (isEmpty()) {
			System.out.println("Queue Is Empty");
			return -1;
		}
		int val = front.val;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		return val;
	}
	
	void print() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		
//		System.out.println(queue.peek());
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);		
		queue.print();
		
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		
		
	}
	
}
