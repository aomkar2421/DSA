package array.easy;

public class SingleNumber {
	public static void main(String[] args) {
		int [] arr = {2,1,2};
		printArray(arr);
		singleNumber(arr);
	}

	public static int singleNumber(int[] nums) {
		int ans = 0;
		for(int i=0; i<nums.length; i++){
			ans = ans ^ nums[i];
		}
		return ans;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
