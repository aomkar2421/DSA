package binarySearch.Answers;

public class KoKoBanana {
	public static void main(String[] args) {
		int [] arr = {3,6,7,11};
		printArray(arr);
		System.out.println(minEatingSpeed(arr, 8));
	}
	
    public static int minEatingSpeed(int[] arr, int h) {
    	
    	int maxValue = Integer.MIN_VALUE;

    	for (int i = 0; i < arr.length; i++) {
			maxValue = Math.max(maxValue, arr[i]);
		}
    	
//    	int minSpeed = Integer.MAX_VALUE;
    	
    	for (int i = 1; i <= maxValue; i++) {
			int speed = 0;
			for (int j = 0; j < arr.length; j++) {
				speed += Math.ceil(arr[j]/i);
			}
			if (speed <= h) {
				return i;
			}
		}
    	
    	
		return -1;       
    }
    
    static int calcHours(int [] arr, int speed) {
    	int hours = 0;
    	for (int i = 0; i < arr.length; i++) {
			hours += Math.ceil(arr[i]/ speed);
		}
    	return hours;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
