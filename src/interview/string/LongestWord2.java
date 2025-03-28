package interview.string;

public class LongestWord2 {
	public static void main(String[] args) {
		String s = "A computer science portal for geeks";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static int solution(String s) {

		int maxLen = 0;
		String [] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			int len = arr[i].length();

			maxLen = Math.max(maxLen, len);
		}

		return maxLen;
	}
}
