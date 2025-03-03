package array.medium;

import java.util.ArrayList;

public class MaxSubArrayWithoutNegative {
	public static void main(String[] args) {
		int [] arr = {1, 2, 5, -7, 2, 6, -1, 6, 3};
		printArray(arr);
		findSubarray(arr);
	}
	
    public static ArrayList<Integer> findSubarray(int arr[]) {
    	int start=0;
    	int startIdx=-1;
    	int endIdx=-1;
    	int sum = 0;
    	int maxSum = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) {
				sum = 0;
				start = i+1;
				continue;
			}else {
				sum += arr[i];
				
				if (maxSum < sum) {
					maxSum = sum;
					startIdx = start;
					endIdx=i;
				}
			}
		}

    	ArrayList<Integer> al = new ArrayList<Integer>();
    	while (startIdx <= endIdx) {
			al.add(arr[startIdx]);
			startIdx++;
		}
		return al;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
