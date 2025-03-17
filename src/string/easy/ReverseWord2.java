package string.easy;

public class ReverseWord2 {
	public static void main(String[] args) {
		String s = "  omkar sanjay jagtap      ";
		System.out.println(s);
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		s = s.trim();
		StringBuilder ans = new StringBuilder();

		int n = s.length()-1;
		int right = n;
		int left;

		while (right >= 0) {
			if (s.charAt(right) == ' ') {
				right--;
				continue;
			}

			left = right;
			while (left >= 0 && s.charAt(left) != ' ') {
				left--;
			}

			ans.append(s.substring(left+1, right+1)).append(" ");
			right = left;
		}

		return ans.toString().trim();
	}

}
