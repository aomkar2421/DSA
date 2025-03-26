package interview.string;

public class CountVowels {
	public static void main(String[] args) {
		String s = " A1 B@ d  adc";
		System.out.println(s);
		solution(s);
	}

	private static void solution(String s) {

		int vowels = 0;
		int consants = 0;
		int digit = 0;
		int special = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
			if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) {
				ch = Character.toLowerCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				}
				else {
					consants++;
				}
			}
			else if (ch > '0' && ch < '9') {
				digit++;
			}
			else {
				special++;
			}

		}
		
		System.out.println("vowels : "+vowels);
		System.out.println("consants : "+consants);
		System.out.println("digit : "+digit);
		System.out.println("special : "+special);

	}
}
