package string.easy;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStringOptimal {
	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		System.out.println(s+" "+t);
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int [] st = new int[256];
		int [] ts = new int[256];
		Arrays.fill(st, -1);
		Arrays.fill(ts, -1);

		for (int i = 0; i < s.length(); i++) {

			char sc = s.charAt(i);
			char tc = t.charAt(i);

			if(st[sc] == -1 && ts[tc] == -1) {
				st[sc] = tc;
				ts[tc] = sc;
			}else if(st[sc] != tc || ts[tc] != sc) {
				return false;
			} 


		}

		return true;
	}

}
