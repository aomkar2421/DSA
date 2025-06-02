package interview.stackqueue.Impl;

public class StackUsingArray {
	
	int [] arr;
	int capacity;
	int top = -1;
	
	public StackUsingArray(int size) {
		arr = new int[size];
		capacity = size;
	}
	
	int push(int val) {
		if (top+1 == capacity) {
			System.out.println("Stack is full");
			return -1;
		}
		top++;
		arr[top] = val;
		return arr[top];
	}
	
	int pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return -1;
		}
		int val = arr[top];
		arr[top] = 0;
		top--;
		return val;
	}
	
	int peek() {
		return arr[top];
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull() {
		return top == capacity;
	}
	
	void print(){
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		StackUsingArray st = new StackUsingArray(5);
		st.push(3);
		st.push(4);
		st.push(1);
		st.push(6);
		st.push(7);
		System.out.println(st.capacity);
		st.push(9);
		st.print();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
	
}
