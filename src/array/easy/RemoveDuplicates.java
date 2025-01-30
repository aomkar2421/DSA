package array.easy;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr = {};
		printArray(arr);
		System.out.println(removeDuplicates(arr));
	}
	
    public static int removeDuplicates(int[] nums) {
        int j =0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[nums.length-1];
        j++;
        return j;

    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
