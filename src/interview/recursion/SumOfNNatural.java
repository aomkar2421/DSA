package interview.recursion;

public class SumOfNNatural {
	public static void main(String[] args) {
		solution(6);
	}

	private static void solution(int num) {

		System.out.println(solve(0, num));
		
	}

	private static int solve(int sum, int num) {
		if (num <= 0) {
			return sum;
		}
		
		sum +=num;
		return solve(sum, num-1);
	}
}
