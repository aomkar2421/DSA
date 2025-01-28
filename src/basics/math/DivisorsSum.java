package basics.math;

public class DivisorsSum {
	public static void main(String[] args) {
		int n = 20;
		System.out.println(sumOfDivisors(n));
	}
	public static int sumOfDivisors(int n) {
		int tsum = 0;
		for (int i = 1; i <= n; i++) {
			tsum += (n / i) * i;
		}

		return tsum;
	}
}
