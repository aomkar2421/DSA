package interview.recursion;

public class NtoOne {
	public static void main(String[] args) {
		solution(10);
	}

	private static void solution(int i) {

		if (i <= 0) {
			return;
		}
		
		System.out.println(i);
		solution(i-1);
	}
}
