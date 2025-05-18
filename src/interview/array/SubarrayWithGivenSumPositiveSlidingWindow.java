package interview.array;

import java.util.ArrayList;
import java.util.Arrays;
// 1 based index
public class SubarrayWithGivenSumPositiveSlidingWindow {
	public static void main(String[] args) {
		int [] arr = {26, 3, 28, 7};
		printArray(arr);
		System.out.println(solution(arr, 52));
	}

	private static ArrayList<Integer> solution(int[] arr, int k) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		int sum = 0;
		int start = -1;
		int curStart = 0;
		int end = -1;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (sum >= k) {
				end = i;
				while ( curStart < end && sum > k) {
					sum -= arr[curStart];
					curStart++;
				}

				if (sum == k) {
					al.add(curStart+1);
					al.add(end);
					return al;
				}
			}

		}


		al.add(-1);
		return al;

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
