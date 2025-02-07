package array.medium;

public class KadaneAlgo {
	public static void main(String[] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		printArray(arr);
		System.out.println(maxSubArray(arr));
	}
	
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];

            maxSum = Math.max(sum, maxSum);

            if(sum<0){
                sum = 0;
            }

        }
        return maxSum;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
