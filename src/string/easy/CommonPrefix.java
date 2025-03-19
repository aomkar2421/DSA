package string.easy;

import java.util.Arrays;

public class CommonPrefix {
	public static void main(String[] args) {
		String [] arr = {"flower","flow","flight"};
		printArray(arr);
		System.out.println(longestCommonPrefix(arr));
	}
	
    public static String longestCommonPrefix(String[] arr) {
    	StringBuilder ans = new StringBuilder();
    	int n = arr.length;
    	
    	Arrays.sort(arr);
    	
    	String first = arr[0];
    	String last = arr[n-1];

    	for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) != last.charAt(i)) {
				break;
			}
			ans.append(first.charAt(i));
		}
    	
        return ans.toString();
    }
	
    private static void printArray(String [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
    
}
