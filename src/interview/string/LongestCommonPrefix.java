package interview.string;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String [] arr = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(arr));
	}

	public static String longestCommonPrefix(String arr[]) {
		
		Arrays.sort(arr);
		
		String first = arr[0];
		String last = arr[arr.length-1];
		
		int minLen = Math.min(first.length(), last.length());
		
		int i = 0;
		while (i < minLen && first.charAt(i) == last.charAt(i)) {
			i++;
		}
		
		return first.substring(0,i);
	}
}
