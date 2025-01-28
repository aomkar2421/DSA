package basics.math;

public class LCMGCD {
	public static void main(String[] args) {
		int a = 50;
		int b = 10;
		lcmAndGcd(a, b);
	}
	public static int[] lcmAndGcd(int a, int b) {

		int n1 = a;
		int n2 = b;

		while(n2 != 0){
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}

		int gcd = n1;

		int lcm = (a*b)/gcd;

		return new int[]{lcm ,gcd};

	}
}
