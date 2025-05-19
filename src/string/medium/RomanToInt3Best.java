package string.medium;

public class RomanToInt3Best {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static int solution(String s) {

		int num = 0;
		
		for (int i=0; i<s.length(); i++) {
			int val = getValue(s.charAt(i));
			int nextVal = 0;
			
			if (i+1 < s.length()) {
				nextVal = getValue(s.charAt(i+1));
				if (val >= nextVal) {
					num += val;
				}else {
					num = num + (nextVal-val);
					i++;
				}
				
			}else {
				num += val;
			}

		}
		return num;
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

