package interview.stackqueue.Impl;

public class QueueUsingArray {
	
	int [] arr;
	int capacity;
	int size;
	int front;
	int rear;
	
	public QueueUsingArray(int capacity) {
		arr = new int[capacity];
		this.capacity = capacity;
		front = 0;
		rear = 0;
		size = 0;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	boolean isFull() {
		return size == capacity;
	}
	
	void enque(int val) {
		if (isFull()) {
			System.out.println("Stack Is Full");
			return;
		}
		arr[rear] = val;
		rear++;
		size++;
	}
	
	int deque() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int val = arr[front];
		arr[front] = 0;
		front++;
		size--;
		return val;
	}
	
	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;	
		}
		return arr[front];
	}
	
	void print() {
		for (int i = front; i < rear; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enque(1);
//		queue.print();
		queue.enque(2);
//		queue.print();
		queue.enque(3);
//		queue.print();
		queue.enque(4);
//		queue.print();
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
		System.out.println(queue.peek());
		
	}
}
