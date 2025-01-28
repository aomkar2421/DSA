package basics.math;

public class Palindrome {
	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		int rev = 0;  
		int num = x;

		while (x != 0) {
			int digit = x % 10; 

			rev = rev * 10 + digit; 
			x = x / 10;  
		}
		return num == rev;

	}
}
