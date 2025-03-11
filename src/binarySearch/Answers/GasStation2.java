package binarySearch.Answers;

public class GasStation2 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		printArray(arr);
		System.out.println(minimiseMaxDistance(arr, 2));
	}
	
	static double minimiseMaxDistance(int[] arr, int k) {
		
		int n = arr.length;
		
		int [] countStations = new int[n-1];
		
		for (int gasStation = 0; gasStation <= k; gasStation++) {
			
			double maxLength = -1;
			int maxIdx = -1;
			
			for (int i = 0; i < n-1; i++) {
				double diff = arr[i+1] - arr[i];
				double sectionLength = diff/ (countStations[i]+1);

				if (maxLength < sectionLength) {
					maxLength = sectionLength;
					maxIdx = i;
				}
			}
			countStations[maxIdx]++;
		}
		
		double maxDis = -1;
		for (int i = 0; i < n-1; i++) {
			double dif = arr[i+1] - arr[i];
			double dis = dif/ (countStations[i]+1);
			
			maxDis = Math.max(maxDis, dis);
			
		}
		
		return maxDis;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
