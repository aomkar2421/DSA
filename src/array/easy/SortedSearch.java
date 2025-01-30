package array.easy;

public class SortedSearch {
	public static void main(String[] args) {
		int [] arr = {};
		printArray(arr);
		System.out.println(searchInSorted(arr, 4));
	}
	
    static boolean searchInSorted(int arr[], int k) {
        int i = 0;
        int j = arr.length-1;
        int m = (i+j)/2;
        
        while(i<=j){
            if(arr[m] == k){
                return true;
            }
            else if(arr[m]<k){
               i = m+1; 
            }
            else{
                j = m-1;
            }
            m = (i+j)/2;
        }
        return false;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
