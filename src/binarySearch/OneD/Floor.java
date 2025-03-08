package binarySearch.OneD;

//largest element in arr[] that is less than or equal to target
public class Floor {
	public static void main(String[] args) {
		int [] arr = {1, 2, 8, 10, 11, 12, 19};
		printArray(arr);
		System.out.println(findFloor(arr, 10));
	}
	
    static int findFloor(int[] arr, int k) {
        int i = 0;
        int j = arr.length-1;
        int m = (i+j)/2;
        int ans = -1;
        
        while(i<=j){
            if(arr[m] > k ){
                j = m-1;
            }else{
                ans = m;
                i = m+1;
            }
            m = (i+j)/2;
        }
        return ans;
     }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
