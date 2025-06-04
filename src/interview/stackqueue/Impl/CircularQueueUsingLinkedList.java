package interview.stackqueue.Impl;

public class CircularQueueUsingLinkedList {
	
	Node front;
	Node rear;
	
	public CircularQueueUsingLinkedList() {
		front = null;
		rear = null;
	}
	
	boolean isEmpty() {
		return front == null;
	}
	
	void enqueue(int val) {
		Node node = new Node(val);
		if (isEmpty()) {
			rear = node;
			front = node;
			return;
		}
		rear.next = node;
		rear = rear.next;
		node.next = front;
	}
	
	int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int val = front.val;
		if (front == rear) {
			front = null;
			rear = null;
			return val;
		}
		
		front = front.next;
		rear.next = front;
		return val;
	}
	
	int front() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.val;
	}
	
	int rear() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return rear.val;
	}
	
	void display() {
		if (isEmpty()) {
			System.out.println("[ ]");
			return;
		}
		Node temp = front;
		
		System.out.print("[ ");
		do {
			System.out.print(temp.val+" ");
			temp = temp.next;
		} while (temp != front);
		System.out.println("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularQueueUsingLinkedList queue = new CircularQueueUsingLinkedList();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.display();
		
		System.out.println(queue.front()+" "+queue.rear());
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front()+" "+queue.rear());
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front()+" "+queue.rear());
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front()+" "+queue.rear());
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front()+" "+queue.rear());
		System.out.println(queue.dequeue());
		queue.display();
		
		System.out.println(queue.front()+" "+queue.rear());
		System.out.println(queue.dequeue());
		queue.display();
		
		
	}

}
