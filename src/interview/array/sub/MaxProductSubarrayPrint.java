package interview.array.sub;

import java.util.ArrayList;

public class MaxProductSubarrayPrint {
	public static void main(String[] args) {
		int [] arr = {-1, -3, -10, 0, 60};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int n = arr.length;
		
		int prefix = 1;
		int suffix = 1;
		int maxPro = Integer.MIN_VALUE;
		
		int curStart = 0;
		int curEnd = 0;
		int resStart = 0;
		int resEnd = 0;
				
		for (int i = 0; i < arr.length; i++) {
			prefix *= arr[i];
			suffix *= arr[n-i-1];
			
//			maxPro = Math.max(maxPro, Math.max(suffix, prefix));
			
			if (prefix > maxPro) {
				maxPro = prefix;
				resStart = curStart;
				resEnd = i;
			}
			else if (suffix > maxPro) {
				maxPro = suffix;
				resStart = n-i-1;
				resEnd = curEnd;
			}
			System.out.println("prefix : "+prefix+"  suffix : "+suffix+"  max : "+maxPro+"  resstsrt : "+resStart+"  resend : "+resEnd+"  "+i+"  "+ (n-i-1) );
			
			if (suffix == 0) {
				suffix = 1;
				curEnd = n-i-2;
			}
			if (prefix == 0) {
				prefix = 1; 
				curStart = i+1;
			}
			
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = resStart; i <= resEnd; i++) {
			al.add(arr[i]);
		}
		System.out.println(al);
		return maxPro;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
