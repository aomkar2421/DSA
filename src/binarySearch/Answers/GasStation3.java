package binarySearch.Answers;

public class GasStation3 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
//		int [] arr = {1,13,17,23};
		printArray(arr);
		System.out.println(findSmallestMaxDist(arr, 4));
	}
	
	static double findSmallestMaxDist(int[] arr, int k) {
				
		int n = arr.length;
		
		double low = 0;
		double high = 0;
		for (int i = 0; i < n-1 ; i++) {
			high = Math.max(high, arr[i+1]-arr[i]);
		}
				
		double mid = (low+high)/2;
		double diff = 1e-6;
		
		while (high-low > diff) {
			int cnt = numberOfStations(arr, mid);
			
			if (cnt > k) {
				low = mid;
			}
			else {
				high = mid;
			}
			mid = (low+high)/2;
		}
		
		return high;
	}

	private static int numberOfStations(int[] arr, double distance) {
		int cnt = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int dif = arr[i+1] - arr[i];
			int num = (int) (dif/distance);
			
			if (dif == distance*num) {
				num--;
			}
			cnt += num;
		}
		return cnt;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
