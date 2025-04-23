package interview.recursion;

public class OneToN {
	public static void main(String[] args) {
		solution(10);
	}

	private static void solution(int i) {

		if (i <= 0) {
			return;
		}
		
		solution(i-1);
		System.out.println(i);
	}
}
