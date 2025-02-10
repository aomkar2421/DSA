package array.medium;

public class RearrangeBySign {
	public static void main(String[] args) {
		int [] arr = {3,1,-2,-5,2,-4};
		printArray(arr);
		rearrangeArray(arr);
	}

	public static int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n]; 

		int pos=0;
		int neg = 1;

		for(int i=0;i<n;i++){
			if(nums[i]<0){
				ans[neg]=nums[i];
				neg +=2;
			}
			else {
				ans[pos] = nums[i];
				pos += 2;
			}
		}
		printArray(ans);
		return ans;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
