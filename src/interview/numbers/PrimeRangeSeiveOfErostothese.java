package interview.numbers;

public class PrimeRangeSeiveOfErostothese {
	public static void main(String[] args) {
		int n = 99;
		solution(n);
	}

	private static void solution(int n) {
		
		int [] arr = new int[n+1];

//		for (int i = 2; i <= Math.sqrt(n); i++) { //both are correct
		for (int i = 2; i*i <= n; i++) {
			
			if (arr[i] == 0) {
				for (int j = i*i; j <= n; j+=i) {
					arr[j] = 1;
				}
			}
			
		}
		
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
