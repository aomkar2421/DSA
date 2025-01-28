package basics.math;

public class CountDigits {
	public static void main(String[] args) {
		int n = 12;
		System.out.println(evenlyDivides(n));
	}
	static int evenlyDivides(int n) {
		int cnt = 0;
		int num = n;

		while(n > 0){
			int lastDigit = n % 10;
			if(lastDigit!=0 && num % lastDigit == 0){
				cnt = cnt + 1;
			}
			n = n / 10;
		}
		return cnt;
	}
}
