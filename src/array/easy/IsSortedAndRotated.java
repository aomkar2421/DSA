package array.easy;

public class IsSortedAndRotated {
	public static void main(String[] args) {
		int [] arr = {4,5,9,7,8,1,2,3};
		printArray(arr);
		System.out.println(check(arr));
	}
	
    public static boolean check(int[] arr) {
    	
    	int cnt = 0;
    	
    	for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] < arr[i] ) {
				cnt++;
			}
		}
    	
		return cnt <= 1;        
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
