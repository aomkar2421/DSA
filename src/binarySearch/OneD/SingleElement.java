package binarySearch.OneD;

public class SingleElement {
	public static void main(String[] args) {
		int [] arr = {1,1,2,3,3,4,4,5,5,8,8};
		printArray(arr);
		System.out.println(singleNonDuplicate(arr));
	}

	public static int singleNonDuplicate(int[] arr) {
		int n = arr.length;
		
		if (n==1) {
			return arr[0];
		}
		
		if (arr[0] != arr[1]) {
			return arr[0];
		}
		
		if (arr[n-1] != arr[n-2]) {
			return arr[n-1];
		}
		
		int i = 1;
		int j = n-2;
		int m = (i+j)/2;
		
		while (i <= j) {
			if (arr[m] != arr[m-1] && arr[m] != arr[m+1]) {
				return arr[m];
			}
			else if (m%2 == 0 && arr[m] == arr[m-1] || m%2 != 0 && arr[m] == arr[m+1] ) {
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = (i+j)/2;
		}
		
		return -1;   
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
