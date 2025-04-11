package interview.recursion;

public class BinaryToDecimal {
	public static void main(String[] args) {
		solution(1101010010);
	}

	private static void solution(long l) {

		int i = solve(l, 0, 0);
		System.out.println(i);
	}

	private static int solve(long l, int i, int sum) {

		if (l <= 0) {
			return sum;
		}
		
		int rem = (int) (l%10);
		sum = (int) (sum + rem * Math.pow(2, i));
		l = l/10;
				
		return solve(l, i+1, sum);
	}

}
