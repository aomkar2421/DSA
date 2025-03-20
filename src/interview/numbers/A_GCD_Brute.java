package interview.numbers;

public class A_GCD_Brute {
	public static void main(String[] args) {
		int a = 98;
		int b = 56;
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		
		int min = Math.min(a, b);
		int ans = 1;
		
		for (int i = min; i > 0; i--) {
			if (a%i == 0 && b%i == 0) {
				return i;
			}
		}
		 
		return ans;
		
	}
}
