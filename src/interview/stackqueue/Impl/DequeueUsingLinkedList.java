package interview.stackqueue.Impl;

public class DequeueUsingLinkedList {
	
	Node front;
	Node rear;
	
	public DequeueUsingLinkedList() {
		front = null;
		rear = null;
	}
	
	boolean isEmpty() {
		return front == null;
	}
	
	void insertFirst(int val) {
		Node node = new Node(val);
		if (isEmpty()) {
			front = node;
			rear = node;
			return;
		}
		node.next = front;
		front = node;
	}
	
	void insertLast(int val) {
		Node node = new Node(val);
		if (isEmpty()) {
			front = node;
			rear = node;
			return;
		}
		rear.next = node;
		rear = node;
	}
	
	int removeFirst() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty");
			return -1;
		}
		
		int val = front.val;
		if (front == rear) {
			front = null;
			rear =  null;
			return val;
		}
		
		front = front.next;
		return val;
	}
	
	int removeLast() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty");
			return -1;
		}
		
		if (front == rear) {
			int val = rear.val;
			front = null;
			rear =  null;
			return val;
		}
		
		Node temp = front;
		while (temp.next != rear) {
			temp = temp.next;
		}
		
		int val = temp.next.val;
		rear = temp;
		rear.next = null;
		return val;
	}
	
	int front() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty");
			return -1;
		}
		return front.val;
	}
	
	int rear() {
		if (isEmpty()) {
			System.out.println("Dequeue is empty");
			return -1;
		}
		return rear.val;
	}
	
	void print() {
		if (isEmpty()) {
			System.out.println("[ ]");
			return;
		}
		Node temp = front;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		DequeueUsingLinkedList dequeue = new DequeueUsingLinkedList();
		dequeue.insertFirst(3);
		dequeue.insertLast(4);
//		dequeue.print();
		dequeue.insertFirst(2);
		dequeue.insertLast(5);
//		dequeue.print();
		dequeue.insertFirst(1);
		dequeue.insertLast(6);
		dequeue.print();
		
		System.out.println(dequeue.front()+" "+dequeue.rear());
		System.out.println(dequeue.removeFirst());
		System.out.println(dequeue.removeLast());
		dequeue.print();
		
		System.out.println(dequeue.front()+" "+dequeue.rear());
		System.out.println(dequeue.removeFirst());
		System.out.println(dequeue.removeLast());
		dequeue.print();
		
		System.out.println(dequeue.front()+" "+dequeue.rear());
		System.out.println(dequeue.removeFirst());
		System.out.println(dequeue.removeLast());
		dequeue.print();
		
		System.out.println(dequeue.front()+" "+dequeue.rear());
		System.out.println(dequeue.removeFirst());
		System.out.println(dequeue.removeLast());
		dequeue.print();
		
		
		
	}
	
}
