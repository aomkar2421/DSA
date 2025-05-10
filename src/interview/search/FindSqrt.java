package interview.search;

public class FindSqrt {
	public static void main(String[] args) {
		System.out.println(solution(2147395599));
		System.out.println(Math.sqrt(2147395599));
	}

	private static int solution(int n) {

		int l = 0;
		int h = n;
		int m = (l+h)/2;
		int res = 1;
		
		while (l <= h) {
			m = l + (h-l)/2;
			
			if ((long) m*m <= (long)n) {
				res = m;
				l = m+1;
			}else {
				h = m-1;
			}
			
		}
		
		return res;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
