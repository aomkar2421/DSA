package interview.numbers;

public class A_GCD {
	public static void main(String[] args) {
		int a = 98;
		int b = 56;
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		
		if (a==0) {
			return b;
		}
		
		if (b==0) {
			return a;
		}
		
		if (a==b) {
			return a;
		}
		
		if (a>b) {
			if (a%b == 0) {
				return b;
			}
			return gcd(a-b, b);
		}
		else {
			if (b%a == 0) {
				return a;
			}
			return gcd(a, b-a);
		}
		
	}
}
