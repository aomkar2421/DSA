package interview.string;

public class ReverseStringArray {
	public static void main(String[] args) {
		String [] s = {"H","a","n","n","a","h"};
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String[] solution(String[] s) {

		int i = 0;
		int j = s.length-1;
		
		while (i<=j) {
			String temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}

		return s;
	}
}
