package interview.array;

import java.util.ArrayList;

public class FindAllMissing {
	public static void main(String[] args) {
		int [] arr = {4,3,2,7,8,2,3,1};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int[] solution(int[] arr) {
		
		int [] hash = new int [arr.length+1];
		
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0) {
				al.add(i);
			}
		}
		
		int ans [] = new int [al.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = al.get(i);
		}
		printArray(ans);
		
		return ans;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
