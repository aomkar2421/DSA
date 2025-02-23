package array.hard;

import java.util.ArrayList;

public class RepeatingAndMissing {
	public static void main(String[] args) {
		int [] arr = {4, 3, 6, 2, 1, 1};
		printArray(arr);
		System.out.println(findTwoElement(arr));
	}
	
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
            long sumN = (long) n * (n + 1) / 2;
            long sumSquaresN = (long) n * (n + 1) * (2 * n + 1) / 6;

            long sumArr = 0, sumSquaresArr = 0; 
            for (int num : arr) {
                sumArr += num;
                sumSquaresArr += (long) num * num;
            }

            long diff = sumN - sumArr; 
            long diffSquares = sumSquaresN - sumSquaresArr; 

            long sum = diffSquares / diff; 

            int missing = (int) ((sum + diff) / 2);
            int repeating = (int) ((sum - diff) / 2);

            ArrayList<Integer> result = new ArrayList<>();
            result.add(repeating);
            result.add(missing);
            return result;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
