package string.medium;

import java.util.Stack;

public class IntegerToRoman {
	public static void main(String[] args) {
		int i = 3571;
		System.out.println(solution(i));
	}

	private static String solution(int num) {
		
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV", "V", "VI", "VII", "VIII", "IX" };
		
        String thousand = m[num/1000];
        String hundread = c[(num%1000)/100];
        String ten = x[ (num%100)/10 ];
        String digit = i[num%10];
        
        String roman = thousand+hundread+ten+digit;
        
		return roman;
	}
}
