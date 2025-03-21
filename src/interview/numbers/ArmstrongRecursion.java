package interview.numbers;

public class ArmstrongRecursion {
	public static void main(String[] args) {
		int n = 153;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		
		int order = calcOrder(n);

		int num = n;
		int res = 0;
		
		while (num != 0) {
			int rem = num%10;
			int pow = pow(rem, order);
			res = res + pow;
			num /= 10;
		}

		return n == res;
	}

	private static int pow(int p, int q) {
		if (q == 0) return 1;
		
		int smallAns = pow(p, q/2);
		
		if (q%2 == 0) {
			return smallAns * smallAns;
		}
		else {
			return p * smallAns * smallAns;
		}		
	}

	private static int calcOrder(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}
