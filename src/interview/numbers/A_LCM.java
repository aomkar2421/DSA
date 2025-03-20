package interview.numbers;

public class A_LCM {
	public static void main(String[] args) {
		int a = 98;
		int b = 56;
		System.out.println(lcm(a,b));
	}

	private static int lcm(int a, int b) {
		int ab = a*b;
		int gcd = gcd(a, b);
		int lcm = ab/gcd;
		return lcm;
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
