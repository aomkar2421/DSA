package interview.numbers;

public class EvenOdd {
	public static void main(String[] args) {
		int n = 1/3;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		
		if (n%2 == 0) {
			return true;
		}
		return false;
	}
}
