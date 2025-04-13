package interview.recursion;

public class DecimalToBinary {
	public static void main(String[] args) {
		solution(6);
	}

	private static void solution(int i) {

		StringBuilder sb = new StringBuilder();
		sb = solve(i, sb);
		System.out.println(sb.reverse());
	}

	private static StringBuilder solve(int i, StringBuilder sb) {

		if (i <= 0) {
			return sb;
		}
		
		int rem = i%2;
		sb.append(rem);
		
		return solve(i/2, sb);
	}

}
