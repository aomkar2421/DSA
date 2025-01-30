package array.easy;

public class Rotate {
	public static void main(String[] args) {
		int [] arr = {};
		printArray(arr);
		rotate(arr, 3);
		printArray(arr);
	}
	
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        
        if(arr.length<=1){
            return;
        }

        int n = arr.length;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);        

    }
    
    public static void reverse(int [] arr, int i, int j){
        while(i<=j){
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
	}
}
