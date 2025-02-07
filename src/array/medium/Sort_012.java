package array.medium;

public class Sort_012 {
	public static void main(String[] args) {
		int [] arr = {0,1,1,2,2,2,0,0,1,1,2,1,1,0,2};
		printArray(arr);
		sortColors(arr);
	}
	
    public static void sortColors(int[] arr) {
        int i=0, j=0, k=arr.length-1;
        
        while (j<=k) {
			if (arr[j]==0) {
				swap(arr, j, i);
				i++;
				j++;
			}
			else if (arr[j]==2) {
				swap(arr, j, k);
				k--;
			}
			else if (arr[j]==1) {
				j++;
			}
		}
        printArray(arr);
    }

    public static void swap(int [] arr,int i, int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
