package array.medium;

import java.util.ArrayList;

public class RearangeElementsSign2 {
	public static void main(String[] args) {
		int [] arr = { 3,1,-2,-5,-7,4,9,8 };
		printArray(arr);
		rearrangeArray(arr);
		printArray(arr);
	}
	
    public static int[] rearrangeArray(int[] arr) {

    	ArrayList<Integer> pos = new ArrayList<Integer>();
    	ArrayList<Integer> neg = new ArrayList<Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				pos.add(arr[i]);
			}else {
				neg.add(arr[i]);
			}
		}
    	
    	int min = Math.min(pos.size(), neg.size());

    	int i;
    	for (i = 0; i < min; i++) {
			arr[i*2] = pos.get(i);
			arr[i*2+1] = neg.get(i);
		}
    	i--;
    	
    	int idx = 2*i; 	
    	idx++;
    	
    	System.out.println("idx "+idx);
    	System.out.println("i "+i);
    	printArray(arr);
    	System.out.println(pos);
    	System.out.println(neg);
    	
    	if (pos.size()<neg.size()) {
			while (idx < arr.length) {
				arr[idx++]=neg.get(i++);  
			}
		}
    	else if (neg.size()<pos.size()) {
			while (idx < arr.length) {
				arr[idx++]=pos.get(i++);  
			}
		}
    	
		return arr;        
    }

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
