package interview.numbers;

public class AutomorphicNumber {
	public static void main(String[] args) {
		int n = 25;
		System.out.println(solution(n));
	}

	private static String solution(int n) {
		
		int sq = n*n;
		
		String s1 = Integer.toString(n);
		String s2 = Integer.toString(sq);
		
		int l1 = s1.length();
		int l2 = s2.length();
//		System.out.println(s1+" "+s2+" "+l1+" "+l2);
//		System.out.println(s2.substring(l2-l1));
		
		String ans = s2.substring(l2-l1);
//		System.out.println(ans+" "+s1);
		System.out.println(ans.equals(s1));
		return ans.equals(s1) ? "Automorphic" : "Not Automorphic";
	}
}
