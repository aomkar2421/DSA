package test;

public class Test { 
	public static void main(String[] args) { 
		Test test = new Test(); 
		test.loop(0); 
	} 
	void loop(int number) { 
		while (++number < 5) { 
			number++; 
			System.out.print(number +" "); 
		} 
	} 
} 