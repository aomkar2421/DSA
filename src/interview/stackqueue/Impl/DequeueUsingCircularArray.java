package interview.stackqueue.Impl;

public class DequeueUsingCircularArray {

	int [] arr;
	int capacity;
	int size;
	int front;
	int rear;

	DequeueUsingCircularArray(int capacity){
		arr = new int[capacity];
		this.capacity = capacity;
		size = 0;
		front = 0;
		rear = 0;
	}
	
    public boolean insertFront(int val) {
        if(isFull()){
            return false;
        }

        front = (front-1+capacity)%capacity;
        arr[front] = val;
        size++;
        return true;
    }
    
    public boolean insertLast(int val) {
        if(isFull()){
            return false;
        }

        rear = (front+size)%capacity;
        arr[rear] = val;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }

        arr[front] = 0;
        front = (front+1)%capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }

        arr[rear] = 0;
        rear = (rear-1+capacity)%capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        int rear = (front - 1 + size) % capacity;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }

	void print() {
		if (isEmpty()) {
			System.out.println("[ ]");
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[(front+i)%capacity]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DequeueUsingCircularArray dequeue = new DequeueUsingCircularArray(3);
		

	}
}
