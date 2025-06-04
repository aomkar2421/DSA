package interview.stackqueue.Impl;

public class CircularQueueUsingArray {
	
	int [] arr;
	int front;
	int rear;
	int size;
	
	public CircularQueueUsingArray(int size) {
		arr = new int[size];
		this.size = size;
		front = -1;
		rear =-1;
	}
	
	boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}
	
	void enque(int val) {
		if (isEmpty()) {
			front = 0;
			rear = 0;
			arr[rear] = val;
			return;
		}
		rear = (rear+1)%size;
		if (rear == front) {
			System.out.println("Queue is full");
			rear = (rear-1+size)%size;
			return;
		}
		arr[rear] = val;
	}
	
	int deque() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int val = arr[front];
		arr[front] = 0;
		
		if (front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = (front+1)%size;	
		}
		return val;
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int val = arr[front];
		return val;
	}
	
	void print() {
		if (isEmpty()) {
			System.out.println("[ ]");
			return;
		}
		System.out.print("[ ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i%size]+" ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		CircularQueueUsingArray queue = new CircularQueueUsingArray(5);
		
//		System.out.println(queue.isEmpty());
//		System.out.println(queue.isFull());
//		queue.enque(1);
//		queue.print();
//		System.out.println(queue.isEmpty()+" "+queue.isFull());
//		System.out.println(queue.peek());
//		System.out.println(queue.deque());
//		queue.print();
//		System.out.println(queue.isEmpty()+" "+queue.isFull());
		queue.enque(1);
		queue.print();
		queue.enque(2);
		queue.print();
		queue.enque(3);
		queue.print();
		queue.enque(4);
		queue.print();
		queue.enque(5);
		queue.print();
		queue.print();
		queue.print();
		
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.deque());
		queue.print();
		System.out.println(queue.deque());
		queue.print();
		
	}
}
