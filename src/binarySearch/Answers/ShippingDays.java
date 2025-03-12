package binarySearch.Answers;

public class ShippingDays {
	public static void main(String[] args) {
		int [] arr = {};
		printArray(arr);
	}
	
    public int shipWithinDays(int[] arr, int days) {
    	
    	int totalWeight = 0;
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < arr.length; i++) {
			totalWeight += arr[i];
			max = Math.max(max, arr[i]);
		}
    	
    	
    	for (int i = max; i <= totalWeight; i++) {
			
    		int requiredDays = findRequiredDays(arr, i);
    		
			if (requiredDays <= days) {
				return i;
			}
		}
    	
		return -1;   
    }
    
    static int findRequiredDays(int [] arr, int i) {
    	
		int requiredDays = 1;
		int load = 0;
    	
    	for (int j = 0; j < arr.length; j++) {
			if (load + arr[j] > i) {
				requiredDays++;
				load = arr[j];
			}
			else {
				load += arr[j];
			}
		}
    	
    	return requiredDays;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
