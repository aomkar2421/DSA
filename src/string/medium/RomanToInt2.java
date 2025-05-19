package string.medium;

public class RomanToInt2 {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static int solution(String s) {

		int num = 0;
		int temp = getValue(s.charAt(0));
		for (int i=1; i<s.length(); ++i) {
			int val = getValue(s.charAt(i));
			if (temp == 0) {
				temp = val;
			} else if (temp >= val) {
				num += temp;
				temp = val;
			} else {
				num = num + val - temp;
				temp = 0;
			}
		}
		return num + temp;
	}

	public static int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}

