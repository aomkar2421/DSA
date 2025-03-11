package binarySearch.Answers;

public class KoKoBanana2 {
	public static void main(String[] args) {
		int [] arr = {3,6,7,11};
		printArray(arr);
		System.out.println(minEatingSpeed(arr, 8));
	}
	
    public static int minEatingSpeed(int[] arr, int h) {
    	
        int maxValue = calMaxValue(arr);
    	
    	int i = 1;
    	int j = maxValue;
    	int m = (i+j)/2;
    	
    	while (i <= j) {
			int hours = calcHours(arr, m);
			
			if (hours <= h) {
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = (i+j)/2;
		}
    	
    	
		return i;       
    }

    static int calMaxValue(int [] arr){
        int maxValue = Integer.MIN_VALUE;

    	for (int i = 0; i < arr.length; i++) {
			maxValue = Math.max(maxValue, arr[i]);
		}
        return maxValue;
    }
    
    static int calcHours(int [] arr, int speed) {
    	int hours = 0;
    	for (int i = 0; i < arr.length; i++) {
			hours += Math.ceil((double)(arr[i]) / (double)(speed));
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
