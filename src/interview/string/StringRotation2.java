package interview.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringRotation2 {
	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "aba";
		System.out.println(s1+" "+s2);
		System.out.println(solution(s1, s2));
	}

	private static boolean solution(String s1, String s2) {

		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.append(s1);
		return sb.lastIndexOf(s2) >= 0;
	}
}
