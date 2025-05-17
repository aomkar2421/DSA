package array.easy;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		printArray(arr);
		System.out.println(removeDuplicates(arr));
	}
	
    public static int removeDuplicates(int[] arr) {
        int k = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[k] = arr[i];
				k++;
			}
		}
        arr[k++] = arr[arr.length-1];
        return k;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
