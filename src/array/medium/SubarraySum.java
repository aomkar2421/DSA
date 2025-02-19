package array.medium;

import java.util.HashMap;

public class SubarraySum {
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		printArray(arr);
		System.out.println(subarraySum(arr, 3));
	}
	
    public static int subarraySum(int[] arr, int k) {

        int prefixSum = 0;
        int cnt = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0, 1);
        
        for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];

			int rem = prefixSum - k;
            cnt = cnt + hm.getOrDefault(rem, 0);

            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
		}
        
        return cnt;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
