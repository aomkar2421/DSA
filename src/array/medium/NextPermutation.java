package array.medium;

public class NextPermutation {
	public static void main(String[] args) {
		int [] arr = {3,2,1};
//		int [] arr = {2,1,5,4,3,0,0};
//		int [] arr = {5,4,3,2,1};
		printArray(arr);
		nextPermutation(arr);
		printArray(arr);
	}
	
    public static void nextPermutation(int[] arr) {
    	int idx = -1;
    	int n = arr.length;
    	
        for (int i = n-2; i >= 0; i--) {
			if (arr[i] < arr[i+1]) {
				idx = i;
				break;
			}
		}

        if (idx == -1) {
			reverse(arr, 0, n-1);
			return;
		}
        
        for (int i = n-1; i > idx; i--) {
			if (arr[i] > arr[idx]) {
				swap(arr, i, idx);
				break;
			}
		}
        reverse(arr, idx+1, n-1);
        
    }

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}

	private static void reverse(int[] arr, int i, int j) {
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
