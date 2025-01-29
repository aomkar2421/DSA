package array.easy;

public class Demo {
	public static void main(String[] args) {
		int [] arr = {1, 8, 7, 56, 90};
		printArray(arr);
		System.out.println(largest(arr));
	}
	
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
