package binarySearch.OneD;

public class FirstAndLastOccurance {
	public static void main(String[] args) {
		int [] arr = {5,7,7,8,8,10};
		printArray(arr);
		searchRange(arr, 8);
	}
	
    public static int[] searchRange(int[] nums, int target) {
    	int n = nums.length;
    	
    	int lb = lowerBound(nums, target);
    	if (lb == n || nums[lb] != target) {
			return new int [] {-1,-1};
		}
    	int ub = upperBound(nums, target);
    	
		return new int [] {lb, ub-1};   
    }
    
    static int lowerBound(int[] arr, int target) {
    	int i = 0;
    	int j = arr.length-1;
    	int m = i+(j-i)/2;
    	int ans = arr.length;
    	
    	while (i <= j) {
			if (arr[m] >= target) {
				ans = m;
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = i+(j-i)/2;
		}
		return ans;
    }
    
    static int upperBound(int[] arr, int target) {
    	int i = 0;
    	int j = arr.length-1;
    	int m = i+(j-i)/2;
    	int ans = arr.length;
    	
    	while (i <= j) {
			if (arr[m] > target) {
				ans = m;
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = i+(j-i)/2;
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
