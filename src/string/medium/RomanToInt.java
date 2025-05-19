package string.medium;

import java.util.HashMap;
import java.util.Stack;

public class RomanToInt {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static int solution(String s) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int sum = 0;
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int val = hm.get(ch);
			int nextVal = 0;
			char nextChar = ' ';
			
			if (i+1 < s.length()) {
				nextChar = s.charAt(i+1);
				nextVal = hm.get(nextChar);
			}
			
			if (ch == 'I' && nextChar == 'V') {
				sum = sum + ( nextVal-val );
				i=i+1;
			}
			else if (ch == 'I' && nextChar == 'X') {
				sum = sum + ( nextVal-val );
				i=i+1;
			}
			else if (ch == 'X' && nextChar == 'L') {
				sum = sum + ( nextVal-val );
				i=i+1;
			}
			else if (ch == 'X' && nextChar == 'C') {
				sum = sum + ( nextVal-val );
				i=i+1;
			}
			else if (ch == 'C' && nextChar == 'D') {
				sum = sum + ( nextVal-val );
				i=i+1;
			}
			else if (ch == 'C' && nextChar == 'M') {
				sum = sum + ( nextVal-val );
				i=i+1;
			}
			else {
				sum += val;
			}
		}
		
		return sum;
	}
}
