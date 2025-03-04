package array.medium;

public class RearangeElementsSign {
	public static void main(String[] args) {
		int [] arr = { 3,1,-2,-5,2,-4 };
		printArray(arr);
		rearrangeArray(arr);
		printArray(arr);
	}
	
    public static int[] rearrangeArray(int[] arr) {
    	int [] ans = new int[arr.length];
    	
    	int pos = 0;
    	int neg = 1;
    	
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				ans[pos] = arr[i];
				pos=pos+2;
			}else {
				ans[neg] = arr[i];
				neg=neg+2;
			}
		}
    	
		return ans;        
    }

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
