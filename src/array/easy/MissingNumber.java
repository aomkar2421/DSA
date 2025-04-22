package array.easy;

public class MissingNumber {
	public static void main(String[] args) {
		int [] arr = {1,0,3};
		printArray(arr);
		System.out.println(missingNumber(arr));
	}
	
    public static int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        for(int i=0;i<=nums.length;i++)
        {
            ans=ans^i;
        }
        return ans; 
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
