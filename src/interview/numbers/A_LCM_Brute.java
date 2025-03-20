package interview.numbers;

public class A_LCM_Brute {
	public static void main(String[] args) {
		int a = 12;
		int b = 20;
		System.out.println(lcm(a,b));
	}

	private static int lcm(int a, int b) {
		
		int max = Math.max(a, b);
		int min = Math.min(b, a);
		
		for (int i = max; i <= a*b; i+=max) {
			if (i%min == 0) {
				return i;
			}
		}
		
		return a*b;
	}
}
