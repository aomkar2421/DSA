package array.easy;

public class ConsecutiveOnes {
	public static void main(String[] args) {
		int [] arr = {1,1,0,1,1,1};
		printArray(arr);
		findMaxConsecutiveOnes(arr);
	}
	
    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }else{
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        return Math.max(count, maxCount);
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
