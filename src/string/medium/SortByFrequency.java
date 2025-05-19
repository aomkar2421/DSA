package string.medium;

import java.util.Arrays;

public class SortByFrequency {
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		int n = s.length();

		int freq [] = new int [128];

		for (char ch : s.toCharArray()) {
			freq[ch]++;
		}

		int[][] charFreq = new int[128][2];
		for (int i = 0; i < freq.length; i++) {
			charFreq[i][0] = freq[i];
			charFreq[i][1] = i;
		}

		Arrays.sort(charFreq, (a,b) -> b[0]-a[0]);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < charFreq.length; i++) {
			char ch = (char) charFreq[i][1];
			int cnt = charFreq[i][0];
			sb.append(String.valueOf(ch).repeat(cnt));
		} 

		return sb.toString();
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
