package basics.recursion;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = "omkar";
		isPalindrome(s);
	}
	public static boolean isPalindrome(String s) {

		if(s.length() <= 1){
			return true;
		}

		s = s.toLowerCase();

		String str="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				str+=s.charAt(i);
			}
		}

		int i=0,j=str.length()-1;

		boolean b = checkPalindrome(str, i, j);

		return b;
	}

	public static boolean checkPalindrome(String str, int i, int j){
		if(i>=j){
			return true;
		}

		if(str.charAt(i) != str.charAt(j))
		{
			return false;
		}
		else
		{
			return checkPalindrome(str, i+1, j-1);
		}

	}
}
