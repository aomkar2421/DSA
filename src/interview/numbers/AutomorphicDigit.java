package interview.numbers;

public class AutomorphicDigit {
	public static void main(String[] args) {
		int n = 30;
		System.out.println(solution(n));
	}

	private static String solution(int n) {
		
		int sq = n*n;
		
		int n1 = n%10;
		int n2 = sq%10;
		
		return n1==n2  ? "Automorphic" : "Not Automorphic";
	}
}
