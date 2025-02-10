package array.medium;

public class Stocks_1 {
	public static void main(String[] args) {
		int [] arr = {7,1,5,3,6,4};
		printArray(arr);
		System.out.println(maxProfit(arr));
	}
	
    public static int maxProfit(int[] arr) {
       	int profit = 0;
	int maxProfit = 0;
	int minPrice = Integer.MAX_VALUE;
	
	for (int i = 0; i < arr.length; i++) {
		
		if (minPrice > arr[i]) {
			minPrice = arr[i];
		}
		
		profit = arr[i] - minPrice;
		
		if (maxProfit < profit) {
			maxProfit = profit;
		}
	}
	
    return maxProfit; 
}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
