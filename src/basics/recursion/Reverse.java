package basics.recursion;

public class Reverse {
	public static void main(String[] args) {
		int [] arr = {1, 4, 3, 2, 6, 5};
		reverseArray(arr);
	}
    public static void reverseArray(int arr[]) {
        int n = arr.length;
        reverse(arr, 0, n-1);
    }
    
    public static void reverse(int [] arr, int i, int j){
        if(i>=j){
            return;
        }
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        reverse(arr, i+1, j-1);
    }
}
