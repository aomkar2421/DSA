package string.easy;

public class OddNumString {
	public static void main(String[] args) {
		String s = "2";
		System.out.println(s);
		System.out.println(largestOddNumber(s));
	}
	
    public static String largestOddNumber(String s) {
    	
    	String ans = "";
    	int n = s.length()-1;
    	
    	for (int i = n; i >= 0; i--) {
			int num = s.charAt(i);
			if (num%2 != 0) {
				return s.substring(0, i+1);
			}
		}
    	
        return ans;
    }
	
}
