package interview.numbers;

public class ArmstrongIteration {
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
		int ans = 1;
		for (int i = 0; i < q; i++) {
			ans = ans * p;
		}
		return ans;
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
