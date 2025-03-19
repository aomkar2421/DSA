package interview.numbers;

public class NthArmstrong {
	public static void main(String[] args) {
		System.out.println(nthArmstrong(10));
	}

	private static int nthArmstrong(int n) {
//		int count = 0;		
//		while (count < n) {
//			num++;
//			if (isArmstrong(num)) {
//				count++;
//			}
//		}
//		return num;
		
//		int count = 0;
//		int num;
//		int armNumber = 0;
//		for (num=1; count < n; num++) {
//			if (isArmstrong(num)) {
//				count++;
//				armNumber = num;
//			}
//		}
//		
//		return armNumber;
		
		int count = 0;
		int num;
		for (num=1; count < n; num++) {
			if (isArmstrong(num)) {
				count++;
			}
		}
		
		return num-1;
	}

	private static boolean isArmstrong(int n) {
		
		String string = Integer.toString(n);
		int order = string.length();

		int res = 0;
		for (char ch : string.toCharArray()) {
			res = (int) (res + Math.pow(ch - '0', order));
		}

		return res == n;
	}
}
