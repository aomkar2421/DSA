package binarySearch.OneD;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr = {-1,0,3,5,9,12};
		printArray(arr);
		System.out.println(search(arr, 9));
	}
	
    public static int search(int[] arr, int target) {
        int i = 0;
        int j = arr.length -1;
        int m = i + (j-i)/2;

        while (i <= j) {
			if (arr[m] == target) {
				return m;
			}else if (arr[m] > target) {
				j = m-1;
			}else {
				i = m+1;
			}
			m = i + (j-i)/2;
		}
        
    	return m;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
