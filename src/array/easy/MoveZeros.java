package array.easy;

public class MoveZeros {
	public static void main(String[] args) {
		int [] arr = {};
		printArray(arr);
		moveZeroes(arr);
		printArray(arr);
	}
	
    public static void moveZeroes(int[] arr) {
        if(arr.length <= 1) return;

        int n = arr.length;
        int i = 0;

        for(int j = 0; j < n; j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
